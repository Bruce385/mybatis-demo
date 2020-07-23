package cyc.bruce.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/23 18:54
 */
public class IdUtil {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test(){
        System.out.println(IdUtil.getId());
        System.out.println(IdUtil.getId());
        System.out.println(IdUtil.getId());
    }
}
