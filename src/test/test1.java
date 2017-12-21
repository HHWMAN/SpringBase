import com.zx.demo.dao.mybatis.AuthorityMapper;
import com.zx.demo.dao.mybatis.RoleAuthorityMapper;
import com.zx.demo.dao.mybatis.UserRoleMapper;
import com.zx.demo.domain.mybatis.*;
import com.zx.demo.security.AppRoleAuthority;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void testUser(){

        List<AppRoleAuthority> authorityList = new ArrayList<AppRoleAuthority>();

        //通过用户id查user、role对应
        String userId = "1";
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUser_idEqualTo(userId);
        List<UserRole> userRoleList = userRoleMapper.selectByExample(userRoleExample);

        //处理得到的对应关系，获得role
        List<Role> roleList = new ArrayList<Role>();
        for(UserRole userRole:userRoleList){
            String roleId = userRole.getRole_id();
            //通过role,查询对应的权限id
            RoleAuthorityExample roleAuthorityExample = new RoleAuthorityExample();
            roleAuthorityExample.createCriteria().andRole_idEqualTo(roleId);
            List<RoleAuthority> roleAuthorities =  roleAuthorityMapper.selectByExample(roleAuthorityExample);

            for(RoleAuthority roleAuthority:roleAuthorities){

                String authorityId = roleAuthority.getRauthority_id();
                Authority authority = authorityMapper.selectByPrimaryKey(authorityId);
              /*  authorityList.add(new AppRoleAuthority(authority));*/
            }
        }
        System.out.println("开始输出");
        System.out.println(authorityList.toString());

    }



}
