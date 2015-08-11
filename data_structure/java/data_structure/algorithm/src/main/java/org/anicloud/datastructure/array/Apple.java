package org.anicloud.datastructure.array;

import org.anicloud.App;

/**
 * Created by zhaoyu on 15-7-20.
 */

class Fruit {
    String color = "not sure";

    public Fruit getThis() {
        return this;
    }

    public void info() {
        System.out.println("fruit method.");
    }
}

public class Apple extends Fruit {
    @Override
    public void info() {
        System.out.println("apple method.");
    }

    public void accessSuperInfo() {
        super.info();
    }

    public Fruit getSuper() {
        return super.getThis();
    }

    String color = "red";

    public static void main(String[] args) {
        Apple apple = new Apple();
        Fruit f = apple.getSuper();

        System.out.println(apple == f);
        System.out.println(apple.color);
        System.out.println(f.color);

        apple.info();
        f.info();

        apple.accessSuperInfo();
    }
}
