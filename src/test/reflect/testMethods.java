package reflect;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ZX on 2018/7/10.
 *
 * @param
 * @return
 */
public class testMethods {


    public static void main(String[] arg){

        //加载并初始化类
        Class clazz = null;
        try {
            clazz = Class.forName("reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //生成对象
        Object test = null;
        try {
            test = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(test.getClass());

       /* for(Field singleField:test.getClass().getFields()){
            System.out.println(singleField.getName()+"---------------");
        }


        System.out.println("##############################################");

        //遍历各个属性
        //System.out.println(test.getClass().getDeclaredFields().toString());
        for(Method method:test.getClass().getMethods()){
            System.out.println(method);
            System.out.println("--------------------");
        }*/

        System.out.println("##############################################");

        for(Method method:test.getClass().getDeclaredMethods()){
            System.out.println(method);
            System.out.println("--------------------");
        }


        Method a=null;
        try {
             a = test.getClass().getDeclaredMethod("eat",String.class);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //设置可读
        a.setAccessible(true);

        try {
          Object result =  a.invoke(test,"aaaa");
            System.out.println(result);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        try {
            a = test.getClass().getDeclaredMethod("sing");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        try {
            Object result2 =  a.invoke(test);
            System.out.println(result2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }



        try {
            a = test.getClass().getDeclaredMethod("drink",String.class,String.class);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        try {
            Object result3 =  a.invoke(test,"coffee","milk");
            System.out.println(result3);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
