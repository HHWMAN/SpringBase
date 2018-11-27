package aop.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

    private  Object proxy;
    public MyInvocationHandler(Object ob) {
        this.proxy = ob;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------插入前置通知代码-------------");
        //执行相应的目标方法
        Object rs = method.invoke(this.proxy,args);
        System.out.println("------插入后置处理代码-------------");
        return rs;
    }
}
