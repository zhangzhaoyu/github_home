package org.anicloud.datastructure.array;

import java.util.Arrays;

/**
 * Created by zhaoyu on 15-7-19.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] books = new String[] {
                "zhang",
                "zhao",
                "yu"
        };

        String[] names = {
                "zhang",
                "zhao",
                "yu"
        };

        String[] strArr = new String[5];
        System.out.println(Arrays.toString(books));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(strArr));
        char a = 'a';
        System.out.println(Character.SIZE);

        int[] arrInt = null;
        System.out.println(Arrays.toString(arrInt));

    }
}
