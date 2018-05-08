import com.zx.demo.dao.mybatis.AuthorityMapper;
import com.zx.demo.dao.mybatis.RoleAuthorityMapper;
import com.zx.demo.dao.mybatis.UserRoleMapper;
import com.zx.demo.domain.mybatis.*;
import com.zx.demo.security.AppRoleAuthority;
import com.zx.demo.utils.id.UUIDHexIdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.vote.AffirmativeBased;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.SecurityNamespaceHandler;
import org.springframework.security.config.http.HttpSecurityBeanDefinitionParser;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.access.expression.WebExpressionVoter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.handler.AbstractHandlerMethodMapping;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.xml.ws.spi.http.HttpContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZX on 2017/12/15.
 *
 * @param
 * @return
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/WEB-INF/applicationContext.xml")
public class test1 {

    @Autowired
    UserRoleMapper userRoleMapper;

    @Autowired
    RoleAuthorityMapper roleAuthorityMapper;

    @Autowired
    AuthorityMapper authorityMapper;

    RequestMappingHandlerAdapter a;

    AuthenticationManager b;
    ProviderManager bb;
    AbstractUserDetailsAuthenticationProvider bbb;
    DaoAuthenticationProvider bbbb;
    UserDetailsManager bbbbb;
    UsernamePasswordAuthenticationFilter BBBBB;
    AnonymousAuthenticationFilter dfasdf;
    FilterSecurityInterceptor adfasd;
    AffirmativeBased asdf;
    WebExpressionVoter asdfwe;
    FilterChainProxy asdfasg;

    SecurityNamespaceHandler sdfas;

    HttpSecurityBeanDefinitionParser asdgfsa;

    AbstractAuthenticationProcessingFilter asdfsa;





    //
    AuthorizationServerConfigurer asdfa;

    ClientDetailsServiceConfigurer bad;
    AuthorizationServerSecurityConfigurer bdae;

    AuthorizationServerEndpointsConfigurer basdfe;

    AuthorizationServerTokenServices bae;





    @Test
    public void testUUid(){
        SqlSessionFactoryBean test;

        String uuid = UUIDHexIdGenerator.getInstance().generate().toString();
        String uuid2 = UUIDHexIdGenerator.generate().toString();
        System.out.println("---------------------------------");
        System.out.println(uuid);
        System.out.println(uuid2);

    }



}
