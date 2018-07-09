import com.zx.demo.dao.mybatis.AuthorityMapper;
import com.zx.demo.dao.mybatis.RoleAuthorityMapper;
import com.zx.demo.dao.mybatis.UserRoleMapper;
import com.zx.demo.utils.id.UUIDHexIdGenerator;
import jdk.nashorn.internal.runtime.linker.Bootstrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by ZX on 2017/12/15.
 *
 * @param
 * @return
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/WEB-INF/applicationContext.xml")
public class test2 {


    Bootstrap a;
    ClassLoader aac;

    @Test
    public void testUUid(){
        /*XmlBeanFactory a;
        XmlWebApplicationContext xa;
        ApplicationContext aa;
        HierarchicalBeanFactory ha;
        Class aaa;
        Type aaaa;
        ParameterizedTypeImpl pai;
        TypeVariableImpl ti;
        GenericArrayTypeImpl gai;*/

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);

        String stra = "abc";
        String strb = "abc";
        System.out.println(stra == strb);

    }



}
