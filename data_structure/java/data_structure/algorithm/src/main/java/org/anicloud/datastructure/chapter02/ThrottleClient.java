package org.anicloud.datastructure.chapter02;

import java.util.Arrays;

/**
 * Created by zhaoyu on 15-7-12.
 */
public class ThrottleClient {
    public static void main(String[] args) {
        Throttle throttle = new Throttle(100);
        System.out.println("throttle : " + throttle);
        try {
            Throttle cloneObj = throttle.clone();
            cloneObj.shift(10);
            System.out.println("cloneObj : " + cloneObj);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("error");
        }
        System.out.println("throttle : " + throttle);

        int[] a = new int[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(a));
        int[] b = a.clone();
        b[0] = 1000;
        System.out.println(Arrays.toString(b));

        double[] data = new double[]{1, 2, 3};
        System.out.println(search(data, 1.0000 ));
    }

    public static String changeName(String name) {
        name = name + "xxx";
        return name;
    }

    public static boolean search(double[] data, double target) {
        for (double item : data) {
            if (item == target) return true;
        }
        return false;
    }
}