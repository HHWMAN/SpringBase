package typeTest;

import jdk.nashorn.internal.runtime.linker.Bootstrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;

import java.lang.reflect.Type;

/**
 * Created by ZX on 2017/12/15.
 *
 * @param
 * @return
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/WEB-INF/applicationContext.xml")
public class typeTest1 {


    Bootstrap a;

    @Test
    public void testUUid(){
        XmlBeanFactory a;
        XmlWebApplicationContext xa;
        ApplicationContext aa;
        HierarchicalBeanFactory ha;
        Class aaa;
        Type aaaa;
        ParameterizedTypeImpl pai;
        TypeVariableImpl ti;
        GenericArrayTypeImpl gai;
        try {
            Class.forName("a");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



}
