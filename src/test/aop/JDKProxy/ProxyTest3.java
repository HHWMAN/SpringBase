package aop.JDKProxy;

import aop.EnglishTeacher;
import aop.Teacher;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class ProxyTest3 {
    

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取动态代理类
        Class proxyClazz = Proxy.getProxyClass(Teacher.class.getClassLoader(),Teacher.class);
        //获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        //通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        Teacher proxyEt = (Teacher) constructor.newInstance(new MyInvocationHandler(new EnglishTeacher()));
        String  a = proxyEt.showClasses();
    }
}
