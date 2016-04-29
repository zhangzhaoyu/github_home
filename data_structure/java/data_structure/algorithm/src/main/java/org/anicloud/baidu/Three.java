package org.anicloud.baidu;

import java.util.Scanner;

/**
 * Created by zhaoyu on 15-9-28.
 */
public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [][]temp = new double[105][10005];
        int n, a, b, x;
        String line = scanner.nextLine();
        String []str = line.split(" ");
        n = Integer.parseInt(str[0]);
        a = Integer.parseInt(str[1]);
        b = Integer.parseInt(str[2]);
        x = Integer.parseInt(str[3]);

        if (b * n < x) {
            System.out.printf("%.4f", 0.0);
        }
        for (int i=a; i<=b; i++) {
            temp[1][i] = 1.0 / (double)(b-a+1);
        }
        for (int i=2; i<=n; i++) {
            for (int j=a; j<=b; j++) {
                for (int k=1; k<=x; k++) {
                    if (k-j>=0) {
                        temp[i][k] += temp[i-1][k-j]/(double)(b-a+1);
                    }
                }
            }
        }

        System.out.printf("%.4f", temp[n][x]);
    }
}
