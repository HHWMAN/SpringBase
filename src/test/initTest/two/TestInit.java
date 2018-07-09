package initTest.two;

/**
 * Created by ZX on 2018/6/28.
 *
 * @param
 * @return
 */
class TestInit {
    public static final int STATIC_FINAL = 11;
    public static int staticNotFinal = 22;
    static {
        System.out.println("静态代码块执行了！");
    }
    public static void test(){
        System.out.println("静态方法执行了");
    }

}
