package org.anicloud.datastructure.list;

import java.util.Iterator;

/**
 * Created by zhaoyu on 15-4-3.
 */
public interface List<E> extends Iterator<E> {

    public abstract void add(E e);
    public abstract void add(E e, int position);
    public abstract E get(int i);
    public abstract void remove(int i);
    public abstract void clear();
    public abstract int size();
    public abstract boolean isEmpty();

}
