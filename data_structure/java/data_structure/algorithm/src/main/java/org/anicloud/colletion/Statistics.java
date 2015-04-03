package org.anicloud.colletion;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by zhaoyu on 15-4-1.
 */
public class Statistics {

    public static void main(String[] args) {
        Random random = new Random(47);

        Map<Integer, Integer> intMaps = new HashMap<Integer, Integer>();
        for (int i=0; i< 100000; i++) {
            int randomInt = random.nextInt(20);
            Integer freq = intMaps.get(randomInt);
            intMaps.put(randomInt, freq == null ? 1 : freq + 1);
        }
        System.out.println(intMaps);
    }

}
