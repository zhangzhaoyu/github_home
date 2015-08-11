package org.anicloud.datastructure.chapter05;

/**
 * Created by zhaoyu on 15-7-25.
 */
public class HanoiTest {
    public static long m = 0;

    public static void move(char ch1, long n, char ch2) {
        System.out.println("move " + n + " from " + ch1 + " to " + ch2);
    }

    public static void hanoi(int n, char A, char B, char C) {
        //System.out.println("times " + (++m) + " " + n + " " + A + " " + C);
        if (n == 1)
            move(A, 1, C);
        else {
            hanoi(n-1, A, C, B);
            move(A, n, C);
            hanoi(n-1, B, A, C);
        }
    }

    public static void main(String[] args) {
        hanoi(10, 'A', 'B', 'C');
    }
}
