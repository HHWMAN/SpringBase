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
public class testFields {


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


        //生成age属性的封装对象
        PropertyDescriptor pd = null;
        try {
             pd = new PropertyDescriptor("age",test.getClass());
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }


        //获取age的set方法,并设置值
        Method setMethod =  pd.getWriteMethod();
        try {
            setMethod.invoke(test,new Integer(19));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }





       Method getMethod =  pd.getReadMethod();
        try {
           Object ageOb =  getMethod.invoke(test);
            System.out.println(ageOb);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        //测试name属性
        try {
            pd = new PropertyDescriptor("name",test.getClass());
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        getMethod = pd.getReadMethod();
        try {
            Object name = getMethod.invoke(test,null);
            System.out.println(name);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
