package thread;

import java.util.ArrayList;

public class DemoThread extends Thread{
    public DemoThread(){
        System.out.println("this:"+this);
        System.out.println("Thread.currentThread():"+Thread.currentThread());
        System.out.println("构造 this.isAlive:" + this.isAlive());
        System.out.println("构造 this.getName:" + this.getName());
        System.out.println("构造 Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("构造 Thread.currentThread().getName():"+Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("this:"+this);
        System.out.println("Thread.currentThread():"+Thread.currentThread());
        System.out.println("内部 this.isAlive:" + this.isAlive());
        System.out.println("内部 this.getName:" + this.getName());
        System.out.println("内部 Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("内部 Thread.currentThread().getName():"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {


        DemoThread d = new DemoThread();
        System.out.println("test d.isAlive():"+d.isAlive());
        System.out.println("test d.getName():"+d.getName());
        Thread t1 = new Thread(d);
        System.out.println("test t1.isAlive():"+t1.isAlive());
        System.out.println("test t1.getName():"+t1.getName());
        t1.setName("213");
        t1.start();
        System.out.println("外部d.isAlive():"+d.isAlive());
        System.out.println("外部d.getName():"+d.getName());
        System.out.println("外部t1.isAlive():"+t1.isAlive());
        System.out.println("外部t1.getName():"+t1.getName());


       /* DemoThread f = new DemoThread();
        f.start();
        System.out.println("外部f.isAlive():"+f.isAlive());
        System.out.println("外部f.getName():"+f.getName());*/
    }
}