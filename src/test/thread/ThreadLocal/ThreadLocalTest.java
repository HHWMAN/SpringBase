package thread.ThreadLocal;


public class ThreadLocalTest {
    private  static ThreadLocal<Integer>  integerThreadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };


    public static void main(String[] args) {
        integerThreadLocal.set(5);
        Thread AA = new IntegerThread(integerThreadLocal);
        AA.setName("AA");
        Thread BB = new IntegerThread(integerThreadLocal);
        BB.setName("BB");
        AA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BB.start();

        /*final Person mainPerson = new Person("mainname",11);
        System.out.println(mainPerson+" "+mainPerson.getName());
        ThreadLocal<Person>  personThreadLocal = new ThreadLocal<Person>(){
            @Override
            protected Person initialValue() {
                mainPerson.setName(Thread.currentThread().getName());
                return mainPerson;
            }
            *//*protected Person initialValue() {
                return new Person(Thread.currentThread().getName(),22);
            }*//*
        };
        Thread XX = new PersonThread(personThreadLocal);
        XX.setName("XX");
        Thread YY = new PersonThread(personThreadLocal);
        YY.setName("YY");

        XX.start();
        YY.start();*/
    }

}


class IntegerThread extends Thread{

    private ThreadLocal<Integer> tl;
    private Integer value;

    public IntegerThread(ThreadLocal<Integer> tl) {
       /* this.value = tl.get();
        System.out.println("当前线程"+Thread.currentThread().getName()+",获取到的初始化值:"+value);*/
       this.tl = tl;
    }

    @Override
    public void run() {
        super.run();
        this.value = tl.get();
        System.out.println("run当前线程"+Thread.currentThread().getName()+",获取到的初始化值:"+value);
        for(int i=0;i<10;i++){
            value = value+1;
            System.out.println(Thread.currentThread()+":"+value);


        }
    }
}

class PersonThread extends Thread{

    private ThreadLocal<Person> tl;
    private Person value;

    public PersonThread(ThreadLocal<Person> tl) {
        this.tl = tl;
        /*this.value = tl.get();
        System.out.println("当前线程"+Thread.currentThread().getName()+",获取到的初始化值:"+value.getName());*/
    }

    @Override
    public void run() {
        super.run();
        this.value = tl.get();
        System.out.println("当前线程"+Thread.currentThread().getName()+",获取到的初始化值:"+value+" "+value.getName());
        for(int i=0;i<10;i++){
            String name =value.getName();
            value.setName(name+"_A");
            System.out.println(Thread.currentThread()+":"+value+":"+value.getName());


        }
    }
}