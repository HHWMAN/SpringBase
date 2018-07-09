package typeTest;

import com.zx.demo.domain.mybatis.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ZX on 2018/6/26.
 *
 * @param
 * @return
 */
public class ParameterizedTypeBean {
    // 下面的 field 的 Type 属于 ParameterizedType
    Map<String, User> map;
    Set<String> set1;
    Class<?> clz;
    Holder<String> holder;
    List<String> list;
    // Map<String,Person> map 这个 ParameterizedType 的 getOwnerType() 为 null，
    // 而 Map.Entry<String, String> entry 的 getOwnerType() 为 Map 所属于的 Type。
    Map.Entry<String, String> entry;
    // 下面的 field 的 Type 不属于ParameterizedType
    String str;
    Integer i;
    Set set;
    List aList;
    Class a;
    List<String>[] pTypeArray;

    static class Holder<V> {

    }
}