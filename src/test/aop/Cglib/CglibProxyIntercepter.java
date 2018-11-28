package aop.Cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyIntercepter implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib执行前...");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib执行后...");
        return object;
    }
}
