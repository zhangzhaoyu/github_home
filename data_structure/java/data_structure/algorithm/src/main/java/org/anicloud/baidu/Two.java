package org.anicloud.baidu;

import java.util.Scanner;

/**
 * Created by zhaoyu on 15-9-28.
 */
public class Two {
    public static void main(String[] args) {
        String str;
        int sum;
        int []a = new int[13];

        Scanner scanner = new Scanner(System.in);
        String times = scanner.nextLine();
        int t = Integer.parseInt(times);
        while (t-- > 0) {
            str = scanner.nextLine();
            for (int i=0; i<12; ++i) {
                a[11-i] = find(str.substring(i));
            }
            sum = 0;
            for (int i = 0; i < 12; ++i) {
                if (a[i] > 0) {
                    sum += a[i] * factorial(i);
                }
            }
            System.out.println(sum + 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int find(String str) {
        int count = 0;
        for (int i=1; i < str.length(); ++i) {
            if (str.charAt(i) < str.charAt(0)) ++count;
        }
        return count;
    }
}
