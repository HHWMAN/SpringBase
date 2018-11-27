package enumTest;

import jdk.nashorn.internal.runtime.linker.Bootstrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ZX on 2017/12/15.
 *
 * @param
 * @return
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/WEB-INF/applicationContext.xml")
public class test1 {


    @Test
    public void testUUid(){
        System.out.println("-----------------");
        define test = define.FOUR;
        define.valueOf("Four");
        System.out.println(test.name());
        System.out.println(define.FIRST.getClass().getCanonicalName());
    }



}
