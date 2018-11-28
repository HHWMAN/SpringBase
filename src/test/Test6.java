import aop.EnglishTeacher;
import aop.JDKProxy.MyInvocationHandler;
import aop.Teacher;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class Test6 {
    

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println(System.getProperty("user.dir"));
        Properties a = System.getProperties();
        System.out.println(a);

        
    }
}
