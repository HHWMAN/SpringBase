package com.zx.demo.security.QQ;

import com.google.gson.Gson;
import com.zx.demo.domain.mybatis.User;
import com.zx.demo.security.AppUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Created by ZX on 2018/5/11.
 *
 * @param
 * @return
 */
public class QQLoginProvider implements AuthenticationProvider {

    protected final Logger log = LoggerFactory.getLogger(QQLoginFilter.class);


    /**
     * 获取QQ的用户信息
     */
    private static final String GET_USER_INFO = "https://graph.qq.com/user/get_user_info?access_token=%s&oauth_consumer_key=%s&openid=%s";

    private RestTemplate restTemplate;

    public QQLoginProvider(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        QQLoginToken qqLoginToken = (QQLoginToken) authentication;
        String openId = (String) qqLoginToken.getPrincipal();
        String accessToken = qqLoginToken.getAccessToken();
        String oauthConsumerKey = qqLoginToken.getClientId();
        String userInfo = restTemplate.getForObject(String.format(GET_USER_INFO, accessToken, oauthConsumerKey, openId), String.class);
        log.info("获取到的qq登录信息为:{}", userInfo);
        Gson gson = new Gson();
        QQUserInfo qqUserInfo = gson.fromJson(userInfo, QQUserInfo.class);
        if (qqUserInfo.getRet() < 0) {
            throw new InternalAuthenticationServiceException(qqUserInfo.getMsg());
        }

        User user = new User();
        user.setUsername(qqUserInfo.getNickname());
        user.setIsLocked("N");
        user.setIsExpired("N");
        user.setIsEnabled("Y");
        user.setIsCredentialsExpired("N");
        Collection<GrantedAuthority> appUserAuthorities = AuthorityUtils.createAuthorityList("ROLE_USER");
        AppUserDetails securityUser = new AppUserDetails(user, appUserAuthorities);
        QQLoginToken token = new QQLoginToken(securityUser, qqLoginToken.getAccessToken(), qqLoginToken.getClientId(), securityUser.getAuthorities());
        return token;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return QQLoginToken.class.isAssignableFrom(authentication);
    }
}