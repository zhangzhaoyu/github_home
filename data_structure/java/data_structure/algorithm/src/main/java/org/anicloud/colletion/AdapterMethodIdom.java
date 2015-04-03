package org.anicloud.colletion;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhaoyu on 15-4-1.
 */

class ReveribleArrayList<T> extends ArrayList<T> {

    public Iterable<T> reverse() {

        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    @Override
                    public boolean hasNext() {
                        return false;
                    }

                    @Override
                    public T next() {
                        return null;
                    }

                    @Override
                    public void remove() {

                    }
                };
            }
        };
    }

}

public class AdapterMethodIdom  {
}
