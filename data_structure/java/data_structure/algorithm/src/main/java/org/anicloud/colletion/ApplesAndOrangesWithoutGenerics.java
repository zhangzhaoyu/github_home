package org.anicloud.colletion;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by zhaoyu on 15-3-31.
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return this.id;
    }
}

class Orange {

}

public class ApplesAndOrangesWithoutGenerics {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            c.add(i);
        }

        System.out.println(c);
    }

    public void testArraysAndCollectionsLib() {

    }
}
