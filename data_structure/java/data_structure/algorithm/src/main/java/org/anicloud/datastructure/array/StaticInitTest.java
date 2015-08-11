package org.anicloud.datastructure.array;

/**
 * Created by zhaoyu on 15-7-19.
 */
public class StaticInitTest {
    static int count = 2;

    static {
        System.out.println("static init static block.");
        name = "java Programing";
    }

    static String name = "crazy Java";

    public static void main(String[] args) {
        System.out.println("count : " + StaticInitTest.count);
        System.out.println("name : " + StaticInitTest.name);
    }
}
