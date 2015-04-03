package org.anicloud.colletion;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by zhaoyu on 15-4-1.
 */

class CollectionSeq<T> implements Collection<T> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}

public class CollectionSequence extends AbstractCollection<User> {

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public User next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }

    @Override
    public int size() {
        return 0;
    }
}
