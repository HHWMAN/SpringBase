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
public class testField {


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
        System.out.println("##############################################");

        //遍历各个属性
        //System.out.println(test.getClass().getDeclaredFields().toString());
        for(Field singleField:test.getClass().getDeclaredFields()){
            System.out.println(singleField.toString());
            System.out.println(singleField.getName());
            System.out.println(singleField.getType());
            System.out.println(singleField.getGenericType());
            System.out.println("--------------------");
        }


        Field a = null;
        try {
             a = test.getClass().getDeclaredField("age");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        try {
            a.setInt(test,228);
            System.out.println(a);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(test);

    }
}
