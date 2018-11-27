package aop.JDKProxy;

import aop.EnglishTeacher;
import aop.Teacher;

import javax.swing.text.TabExpander;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {


    public static void main(String[] args) {
        final EnglishTeacher et = new EnglishTeacher();
        Object result = Proxy.newProxyInstance(et.getClass().getClassLoader(), et.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("讲课前");
                Object rs = method.invoke(et,args);
                System.out.println("讲课后");
                return rs;
            }
        });
        Teacher proxyEt = (Teacher) result;
        String  a = proxyEt.showClasses();
    }
}
