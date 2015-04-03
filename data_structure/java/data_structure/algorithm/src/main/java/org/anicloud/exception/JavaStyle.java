package org.anicloud.exception;

/**
 * Created by zhaoyu on 15-4-1.
 */
public class JavaStyle {

    private String name;
    private int age;

    public JavaStyle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    final static int COUNTER = 1;

    public int getAge() {
        return age;
    }

    protected void computeCounter() {

    }

    private void privateMethod() {

    }

    public static void main(String[] args) {
        System.out.println("main method.");
    }

    class InnerClass {

    }

}

