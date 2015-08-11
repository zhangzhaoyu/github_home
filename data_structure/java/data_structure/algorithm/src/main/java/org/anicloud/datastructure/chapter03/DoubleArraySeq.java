package org.anicloud.datastructure.chapter03;

/**
 * Created by zhaoyu on 15-7-15.
 */
public class DoubleArraySeq implements Cloneable {
    public DoubleArraySeq() {}

    public DoubleArraySeq(int initialCapacity) {}

    public void addAfter(double element) {}

    public void addBefore(double element) {}

    public void addAll(DoubleArraySeq doubleArraySeq) {}

    public void advance() {}

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void ensureCapacity(int minimumCapacity) {}

    public int getCapacity() {
        return 0;
    }

    public double getCurrent() {
        return 0;
    }

    public boolean isCurrent() {
        return false;
    }

    public void removeCurrent() {}

    public int size() {
        return 0;
    }

    public static DoubleArraySeq concatenation(DoubleArraySeq s1, DoubleArraySeq s2) {
        return null;
    }

}
