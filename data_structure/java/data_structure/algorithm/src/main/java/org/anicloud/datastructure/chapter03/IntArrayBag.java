package org.anicloud.datastructure.chapter03;

/**
 * Created by zhaoyu on 15-7-13.
 */
public class IntArrayBag implements Cloneable {
    private int[] data;
    private int manyItems;

    private final static int DEFAULT_SIZE = 10;

    public IntArrayBag() {
        this(DEFAULT_SIZE);
    }

    public IntArrayBag(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("negative parameter.");
        manyItems = 0;
        data = new int[initialCapacity];
    }

    public void add(int element) {
        if (manyItems == data.length) {
            // TODO
            ensureCapacity(manyItems * 2 + 1);
        }
        data[manyItems] = element;
        manyItems ++;
    }

    public void addMany(int... elements) {
        // TODO
    }

    public void addAll(IntArrayBag intArrayBag) {
        // TODO
    }

    public void ensureCapacity(int minimumCapacity) {
        int[] biggerArray;

        if (data.length < minimumCapacity) {
            biggerArray = new int[minimumCapacity];
            System.arraycopy(data, 0, biggerArray, 0, manyItems);
        }
    }

    public boolean remove(int target) {
        // TODO
        return false;
    }

    public int countOccurrences(int target) {
        int answer;
        int index;

        answer = 0;
        for (index = 0; index < manyItems; index++) {
            if (target == data[index])
                answer ++;
        }
        return answer;
    }

    public static IntArrayBag union(IntArrayBag bag1, IntArrayBag bag2) {
        // TODO
        return null;
    }

    @Override
    protected IntArrayBag clone()  {
        IntArrayBag answer;

        try {
            answer = (IntArrayBag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This class does not implement Cloneable.");
        }
        // must be
        answer.data = data.clone();
        return answer;
    }


}
