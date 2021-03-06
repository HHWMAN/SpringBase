package com.zx.demo.security.QQ;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ZX on 2018/5/8.
 *
 * @param
 * @return
 */
public class QQLoginFilter extends AbstractAuthenticationProcessingFilter {

    protected final Logger log = LogManager.getLogger(QQLoginFilter.class);

    /**
     * client_id 即在QQ互联上创建应用的APP ID
     */
    private static final String CLIENT_ID = "101386962";

    /**
     * client_secret 即在QQ互联上创建应用的APP Key
     */
    private static final String CLIENT_SECRET = "2a0f820407df400b84a854d054be8b6a";

    /**
     * redirect_uri 即在QQ互联上创建应用的回调地址
     */
    private static final String REDIRECT_URI = "http://www.ictgu.cn/login/qq";

    private static final String CODE = "code";

    /**
     * 需要获取那些接口的访问权限
     */
    private static final String SCOPE = "get_user_info";

    /**
     * 获取授权码url
     */
    private static final String GET_AUTHORIZATION_CODE = "https://graph.qq.com/oauth2.0/authorize?response_type=%s&client_id=%s&redirect_uri=%s&state=%s&scope=%s";

    /**
     * 获取access_token
     */
    public static final String GET_ACCESS_TOKEN = "https://graph.qq.com/oauth2.0/token?grant_type=authorization_code&client_id=%s&client_secret=%s&code=%s&redirect_uri=%s";

    /**
     * 获取openId
     */
    public static final String GET_OPEN_ID = "https://graph.qq.com/oauth2.0/me?access_token=%s";
    /**
     * 用于发送请求
     */
    private final RestTemplate restTemplate;

    protected QQLoginFilter(String defaultFilterProcessesUrl, RestTemplate restTemplate) {
        super(new AntPathRequestMatcher(defaultFilterProcessesUrl, "GET"));
        this.restTemplate = restTemplate;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        String code = obtainCode(request);
        if (StringUtils.isBlank(code)) {
            log.info("没有获取到code的值,引导用户到QQ授权页面");
            response.sendRedirect(String.format(GET_AUTHORIZATION_CODE, CODE, CLIENT_ID, REDIRECT_URI, UUID.randomUUID().toString(), SCOPE));
            return null;
        }
       // log.info("当前是从QQ授权登录返回,获取到code的值为:{}", code);
       // log.info("根据code:{}的值取换取access_token的值", code);
        String result = restTemplate.getForObject(String.format(GET_ACCESS_TOKEN, CLIENT_ID, CLIENT_SECRET, code, REDIRECT_URI), String.class);
       // log.info("根据code:{}获取access_token的返回值是:{}", code, result);
        if (result.contains("error")) {
            throw new InternalAuthenticationServiceException("QQ登录失败");
        }
        String accessToken = result;
       // log.info("获取到的accessToken:{}", accessToken);
        log.info("根据accessToken去获取用户的openId的值。");
        result = restTemplate.getForObject(String.format(GET_OPEN_ID, accessToken), String.class);
        //log.info("根据accessToken：{}换取openId的结果为:{}", accessToken, result);
        String openId = StringUtils.substringBetween(result, "\"openid\":\"", "\"}");
       // log.info("根据accessToken:{}换取的openId的值为:{}", accessToken, openId);

        QQLoginToken qqLoginToken = new QQLoginToken(openId, accessToken, CLIENT_ID);
        qqLoginToken.setDetails(authenticationDetailsSource.buildDetails(request));

        return super.getAuthenticationManager().authenticate(qqLoginToken);
    }

    protected String obtainCode(HttpServletRequest request) {
        return request.getParameter(CODE);
    }

}
