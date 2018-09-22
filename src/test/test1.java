import com.zx.demo.dao.mybatis.AuthorityMapper;
import com.zx.demo.dao.mybatis.RoleAuthorityMapper;
import com.zx.demo.dao.mybatis.UserRoleMapper;
import com.zx.demo.domain.mybatis.*;
import com.zx.demo.security.AppRoleAuthority;
import com.zx.demo.utils.id.UUIDHexIdGenerator;
import javafx.print.Collation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.access.vote.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.SecurityNamespaceHandler;
import org.springframework.security.config.http.HttpSecurityBeanDefinitionParser;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.web.access.expression.WebExpressionVoter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.rememberme.RememberMeAuthenticationFilter;
import org.springframework.security.web.authentication.session.ConcurrentSessionControlAuthenticationStrategy;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.header.HeaderWriterFilter;
import org.springframework.security.web.session.ConcurrentSessionFilter;
import org.springframework.security.web.session.SessionManagementFilter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.handler.AbstractHandlerMethodMapping;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.sql.DataSource;
import javax.xml.ws.spi.http.HttpContext;
import java.io.File;
import java.util.*;

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

    ChannelProcessingFilter ade;
    SecurityContextPersistenceFilter ee;
    ConcurrentSessionFilter fea;
    HeaderWriterFilter ad;
    CsrfFilter asddf;
    LogoutFilter et;
    UsernamePasswordAuthenticationFilter BBBBB;
    BasicAuthenticationFilter aaade;
    RememberMeAuthenticationFilter adfeiii;
    AnonymousAuthenticationFilter dfasdf;
    FilterSecurityInterceptor adfasd;


    AbstractAccessDecisionManager ea;
    AffirmativeBased asdf;
    ConsensusBased aaaaaa;
    UnanimousBased asdfetget;

    WebExpressionVoter asdfwe;
    RoleHierarchyVoter ja;


    FilterChainProxy asdfasg;
    DefaultSecurityFilterChain DF;
    FilterInvocation adfasdfasdfas;



    SecurityNamespaceHandler sdfas;


    /*xml 配置解析器*/
    HttpSecurityBeanDefinitionParser asdgfsa;

    AbstractAuthenticationProcessingFilter asdfsa;





    //
    AuthorizationServerConfigurer asdfa;

    ClientDetailsServiceConfigurer bad;
    AuthorizationServerSecurityConfigurer bdae;

    AuthorizationServerEndpointsConfigurer basdfe;

    AuthorizationServerTokenServices bae;

    ConcurrentSessionControlAuthenticationStrategy sa;

    SessionManagementFilter saa;
    SessionRegistryImpl saaa;






    @Test
    public void testUUid(){
        SqlSessionFactoryBean test;

        String uuid = UUIDHexIdGenerator.getInstance().generate().toString();
        String uuid2 = UUIDHexIdGenerator.generate().toString();
        System.out.println("---------------------------------");
        System.out.println(uuid);
        System.out.println(uuid2);

        Collection a;

        Map aa;
        Arrays aaa;

        Iterator ia;
        Iterable iab;

    }


    @Test
    public void testDataSource(){


    }


    @Test
    public void test1(){

       File aaaa = new File("");

       ArrayList a = new ArrayList();
       a.add("aaa");
       a.add("bbb");
        System.out.println(a.toString());
        System.out.println(a.getClass().getName());
        System.out.println(a.getClass().getCanonicalName());
        System.out.println(a.getClass().getInterfaces());
        for(Class inter:a.getClass().getInterfaces())
            System.out.println(inter.getCanonicalName());

    }


}
