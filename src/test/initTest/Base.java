package initTest;

import com.zx.demo.domain.mybatis.User;

import java.util.Random;

/**
 * Created by ZX on 2018/6/27.
 *
 * @param
 * @return
 */
public class Base {

    public static final int baseInt = 11;

    public static  int baseInt2 = 12;

    public final int baseInt3 = new Random(10).nextInt(10);

   /* int a=3;*/
    /*static  int a = 3;*/

    static{
        System.out.println("Base static block");
        a=6;
       /* int b = a;*/
    }

    static  int a = 3;
    static int b;
   /* static final User user2;*/
    static User user;

    {
        System.out.println("Base Block");
    }
    public Base(){
         b=6;
        /* user.setUsername("zxtest");*/
        System.out.println("Base Constructor");
    }

    public static void main(String[] args) {
       /* Base test = new Base();*/

      /*  System.out.println(Base.b);
        System.out.println(Base.user.getUsername());*/

        System.out.println("Base中.class调用前");
        Class<Base> test = Base.class;
        System.out.println("Base中.class调用后");
        System.out.println(Base.baseInt);
        System.out.println("------");
        System.out.println(Base.baseInt);


    }
}
