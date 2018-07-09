package initTest.two;

/**
 * Created by ZX on 2018/6/28.
 *
 * @param
 * @return
 */
public class test {


    public static void main(String[] args) throws ClassNotFoundException {
       /* System.out.println(".forName调用前");
        Class clazz0 = Class.forName("initTest.two.TestInit");
        System.out.println(clazz0.toString());
        System.out.println(".forName调用后");
        TestInit.test();


        System.out.println("----------------------------------");

        System.out.println(".class调用前");
        Class<TestInit> clazz1 = TestInit.class;
        System.out.println(clazz1.toString());
        System.out.println(".class调用后");
        TestInit.test();*/

        System.out.println("----------------------------------");

        TestInit testInit = new TestInit();
        System.out.println(".getClass调用前");
        Class clazz2 = testInit.getClass();
        System.out.println(clazz2.toString());
        System.out.println(".getClass调用后");
        TestInit.test();

    }
}
