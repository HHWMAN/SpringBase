package initTest;

import java.util.Random;

/**
 * Created by ZX on 2018/6/27.
 *
 * @param
 * @return
 */
public class Extend extends Base {

    public static final int entendInt = 21;

    public static  int extendInt2 = 22;

    public final int extendInt3 = new Random(20).nextInt(20);

    static {

        System.out.println("Extend static block");
    }
    {
        System.out.println("Extend block");
    }
    public Extend(){
        System.out.println("Extend constructor");
    }


    public static void main(String[] args) {

        System.out.println(Extend.entendInt);
        System.out.println(Extend.extendInt2);
       /* Extend test = new Extend();
        System.out.println(test.extendInt3);*/
      /* Class test = Base.class;*/


        System.out.println("forname加载");
        try {
            Class.forName("initTest.Base");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("实例化");
        Extend test = new Extend();

        System.out.println("实例对象获取class");
        test.getClass();

      /* Base t= new Base();*/

     /*   Base t= new Base();
        System.out.println("------------");
        Extend test = new Extend();*/


    }
}
