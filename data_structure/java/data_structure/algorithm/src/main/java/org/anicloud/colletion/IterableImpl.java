package org.anicloud.colletion;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhaoyu on 15-4-1.
 */

class IteratorImpl<E> implements Iterator<E> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

    @Override
    public void remove() {

    }
}

public class IterableImpl<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public static void main(String[] args) {
        Map<String, String> map = System.getenv();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
