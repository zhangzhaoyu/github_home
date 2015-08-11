package org.anicloud.datastructure.chapter02;

/**
 * Created by zhaoyu on 15-7-12.
 */
public class Throttle implements Cloneable {
    private int top;
    private int position;

    public Throttle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("size < 0 : " + size);
        }
        this.top = size;
    }

    public void shutOff() {
        this.position = 0;
    }

    public void shift(int amount) {
        if (amount > top - position)
            position = top;
        else if (position + amount < 0)
            position = 0;
        else
            position += amount;
    }

    @Override
    protected Throttle clone() throws CloneNotSupportedException {
        return (Throttle) super.clone();
    }

    @Override
    public String toString() {
        return "Throttle{" +
                "top=" + top +
                ", position=" + position +
                '}';
    }
}
