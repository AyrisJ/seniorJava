package basic.collection;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author yangjie
 * @date 2019-11-11
 * @time 17:19
 */
public class MapExcise {

    @Test
    public void testSimpleMap() {
        Map map = new HashMap<>();
        Map safeMap = Collections.synchronizedMap(map);

        map.put(null, "111");
        System.out.println(map.get(null));

        Hashtable table = new Hashtable();
        // Hashtable key设置为null，会报NullPointerException
//        table.put(null, "111");
//        System.out.println(table.get(null));

    }

    @Test
    public void testHash() {
        System.out.println("111".hashCode());
        System.out.println(new Object().hashCode());
    }

    @Test
    public void testBitProcess() {
        int n = 8;
        System.out.println(Integer.toBinaryString(n));

        n |= n >>> 1;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 2;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 4;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 8;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 16;
        System.out.println(Integer.toBinaryString(n));

        //--------------
        System.out.println("------------------------");
        int m = 9;
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(m >> 1));
        m = m >>> 1;
        System.out.println(Integer.toBinaryString(m));
        m = m >>> 2;
        System.out.println(Integer.toBinaryString(m));
        m = m >>> 3;
        System.out.println(Integer.toBinaryString(m));


        System.out.println("------------------------");
        System.out.println(5 >> 1);
        System.out.println(8 >> 1);
        System.out.println(8 >>> 1);
    }

    public static void main(String[] args) {

    }

}
