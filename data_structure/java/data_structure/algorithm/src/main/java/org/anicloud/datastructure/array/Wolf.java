package org.anicloud.datastructure.array;

/**
 * Created by zhaoyu on 15-7-20.
 */
class Animal {
    public String name;

    public void info() {
        System.out.println(name);
    }
}

public class Wolf extends Animal {
    private double weight;
}
