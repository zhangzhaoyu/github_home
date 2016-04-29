package org.anicloud.baidu;

import org.anicloud.datastructure.chapter03.IntArrayBag;

import java.util.*;

/**
 * Created by zhaoyu on 15-9-28.
 */
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(is_include(a, b));
    }
    public static int is_include(String a, String b) {
        if (a == null || b == null) return 0;

        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        int i = 0;
        while (i < a.length()) {
            char aChar = a.charAt(i);
            if (aChar <= 127) {
                i+=1;
            }
            else {
                aChar += a.charAt(i+1);
                i += 2;
            }

            if (aMap.containsKey(aChar)) {
                int count = aMap.get(aChar);
                aMap.put(aChar, count+1);
            } else {
                aMap.put(aChar, 1);
            }
        }
        int j = 0;
        while (j < b.length()) {
            char bChar = b.charAt(j);
            if (bChar <= 127) {
                j+=1;
            }
            else {
                bChar += b.charAt(j+1);
                j += 2;
            }

            if (bMap.containsKey(bChar)) {
                int count = bMap.get(bChar);
                bMap.put(bChar, count+1);
            } else {
                bMap.put(bChar, 1);
            }
        }

        Set<Character> keySet = bMap.keySet();
        for (Character character : keySet) {
            if (aMap.containsKey(character)) {
                if (bMap.get(character) > aMap.get(character)) {
                    return 0;
                }
            }
            else {
                return 0;
            }
        }
        return 1;
    }
}
