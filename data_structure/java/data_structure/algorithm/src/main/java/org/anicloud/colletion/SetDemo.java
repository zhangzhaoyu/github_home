package org.anicloud.colletion;

import java.util.*;

/**
 * Created by zhaoyu on 15-4-1.
 */
public class SetDemo {

    public static void main(String[] args) {
        Random random = new Random(47);

        Set<Integer> set = new HashSet<Integer>();
        for (int i=0; i<10000; i++) {
            set.add(random.nextInt(30));
        }

        System.out.println(set);

        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        for (int i=0; i<10000; i++) {
            sortedSet.add(random.nextInt(30));
        }

        System.out.println(sortedSet);
    }

}
