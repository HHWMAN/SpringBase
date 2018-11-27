package aop.JDKProxy;

import aop.EnglishTeacher;
import aop.Teacher;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest2 {
    

    public static void main(String[] args) {
        final EnglishTeacher et = new EnglishTeacher();
        MyInvocationHandler h = new MyInvocationHandler(et);
        Object result = Proxy.newProxyInstance(et.getClass().getClassLoader(), et.getClass().getInterfaces(), h);
        Teacher proxyEt = (Teacher) result;
        String  a = proxyEt.showClasses();
    }
}
