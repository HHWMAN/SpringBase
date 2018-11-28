package aop.Cglib;

import aop.EnglishTeacher;
import net.sf.cglib.proxy.Enhancer;

public class CglibTest {

    public static void main(String[] args) {
        //代理类class文件存入本地磁盘
        //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(EnglishTeacher.class);
        enhancer.setCallback(new CglibProxyIntercepter());
        EnglishTeacher proxy= (EnglishTeacher)  enhancer.create();
        proxy.showClasses();
    }

}
