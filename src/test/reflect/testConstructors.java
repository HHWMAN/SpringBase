package reflect;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ZX on 2018/7/10.
 *
 * @param
 * @return
 */
public class testConstructors {

    public static void main(String[] arg){

        //加载并初始化类
        Class clazz = null;
        try {
            clazz = Class.forName("reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Object test = null;



        for(Constructor constructor:clazz.getConstructors()){
            System.out.println(constructor.toString());
            System.out.println(constructor.getName());
            System.out.println(constructor.getParameterTypes());
            System.out.println(constructor.getTypeParameters());
            System.out.println("----------------------");
        }

        System.out.println("########################");

        for(Constructor constructor:clazz.getDeclaredConstructors()){
            System.out.println(constructor.toString());
            System.out.println(constructor.getName());
            System.out.println(constructor.getParameterTypes());
            System.out.println(constructor.getTypeParameters());
            System.out.println("----------------------");
        }


        Constructor constructor = null;
        try {
            constructor = clazz.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
          test =  constructor.newInstance("zx");
            System.out.println(test);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        Constructor constructor2 = null;
        try {
            constructor2 = clazz.getDeclaredConstructor(int.class,int.class,int.class);
            constructor2.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            test =  constructor2.newInstance(18,19,20);
            System.out.println(test);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
