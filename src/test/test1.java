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
