package thread;

public class DemoThread2 implements Runnable{
    private  String a ="a";

    public DemoThread2(){
        System.out.println("构造 Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("构造 Thread.currentThread().getName():"+Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("内部 Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("内部 Thread.currentThread().getName():"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        DemoThread2 d = new DemoThread2();
        Thread t1 = new Thread(d);
        t1.setName("213");
        t1.start();
        System.out.println("外部t1.isAlive():"+t1.isAlive());
        System.out.println("外部t1.getName():"+t1.getName());


       /* DemoThread f = new DemoThread();
        f.start();
        System.out.println("外部f.isAlive():"+f.isAlive());
        System.out.println("外部f.getName():"+f.getName());*/
    }
}