package org.anicloud.commons;

import org.apache.commons.collections.MapUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 15-5-8.
 */
public class MapUtilsTest {

    @Test
    public void testMapUtils() {
        Map map = new HashMap();
        String[] arr = {"zhang", "zhaoyu", "yu", "dajia"};
        map = MapUtils.putAll(map, arr);
        System.out.println(map);

        Map test = new HashMap();
        test.put("zhang", "zhaoyu");
        test.put("li", "lili");
        System.out.println(test);
    }

}
