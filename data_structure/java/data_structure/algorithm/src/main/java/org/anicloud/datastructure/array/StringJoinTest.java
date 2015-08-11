package org.anicloud.datastructure.array;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by zhaoyu on 15-7-20.
 */
public class StringJoinTest {
    public static void main(String[] args) {
        String s1 = "crazyjava";
        String s2 = "crazy" + "java";
        System.out.println(s1 == s2);

        final String str1 = "crazy";
        final String str2 = "java";
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
        HashMap hashMap = new HashMap();
    }
}
