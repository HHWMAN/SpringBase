import com.zx.demo.domain.mybatis.User;
import jdk.nashorn.internal.runtime.linker.Bootstrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by ZX on 2017/12/15.
 *
 * @param
 * @return
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/WEB-INF/applicationContext.xml")
public class test3 {


    @Test
    public void test1() {
        Collection a;
        List b;
        AbstractList BB = new ArrayList();
        BB.size();
        ArrayList bbb;
        LinkedList bbbb;

        Deque test = new LinkedList();
        ArrayDeque aaaaa;
        Set c;
        SortedSet d;
        HashSet dh = new HashSet();
        TreeSet e = new TreeSet();
        e.add(new User());

        Queue f;
        Deque g;
        SortedMap h;
        Collections i;

        Map j;
        AbstractMap k;
        HashMap l = new HashMap();
        LinkedHashMap ll;
        TreeMap m;
    }

    @Test
    public void test2() {
      /* ArrayList a = new ArrayList();
       a.add(1);*/
        Integer aaa = 111;
        String a = "a", b = "b";
        if ((a = b).equals("a")) {
            System.out.println("第一个");
            System.out.println(a + " " + b);
        }
        System.out.println("-----------------");
        System.out.println(a + " " + b);
        if ((a = b).equals("b")) {
            System.out.println("第二个");
            System.out.println(a + " " + b);
        }


    }


    @Test
    public void test3() {
        String a = "a";
        a.length();
        String[] aa = new String[10];
        System.out.println(aa.length);
        for (int binCount = 0; ; ++binCount) {
            System.out.println("正在执行");

        }

    }


    @Test
    public void test4() {
        System.out.println("-----------------------");
        System.out.println('a'>'b');
        System.out.println('A'>'B');
        System.out.println('A'>'C');
        System.out.println('Z'>'C');
    }


    @Test
    public void test5() {
        System.out.println("-----------------------");
        TreeMap test = new TreeMap();
        for(int i=0;i<10;i++)
            test.put(i,i);

        System.out.println(test.firstKey());
        System.out.println(test);

        test.get(8);
        test.get(9);
        System.out.println(test.firstKey());
        System.out.println(test);

        for(int i=0;i<10;i++)
            System.out.print(test.get(i)+" ");

    }


    @Test
    public void test6() {
       Integer[] test = new Integer[20];
        for(int i=0;i<20;i++){
           test[i] = i;
        }
       int n = 0;
       for(int i=0;i<20;i++){
           new Value(test[n++],test[n++]);
           System.out.println(n);
           System.out.println("--------------");
       }
    }


    @Test
    public void test7(){
     /*   double result=0.051161122111111;
        DecimalFormat df = new DecimalFormat("0.00%");
        String r = df.format(result);
        System.out.println(r);*/
        //5.12%

        String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        System.out.println(year);
    }

}

