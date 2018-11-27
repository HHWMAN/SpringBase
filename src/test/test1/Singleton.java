package test1;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
public class Singleton {
    public    static Singleton singleton = new Singleton();
    public static Map m;
    static{
        m = new HashMap();
        System.out.println("静态块");
        System.out.println(m.toString());
    }
    private Singleton(){
        System.out.println("调用构造");
        initM();
    }
    public static void initM(){
        if(null == m){
            System.out.println("m 为空");
            m = new HashMap();
        }
        m.put("1", "郑");
        m.put("2", "陈");
        System.out.println(m.toString());
    }
    public static Singleton getInstance(){
        return singleton;
    }
}