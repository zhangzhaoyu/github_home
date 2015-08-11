package org.anicloud.datastructure.chapter05;

import java.util.*;

/**
 * Created by zhaoyu on 15-7-25.
 */
public class DataConversion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int num = 24241;
        while (num > 0) {
            stack.push(num % 10);
            num = num / 10;
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop());
        }

        System.out.println("--------------------------------");
        Deque<Integer> stack1 = new ArrayDeque<>();
        int number = 12;
        while (number > 0) {
            stack1.push(number % 8);
            number = number / 8;
        }

        while (stack1.size() > 0) {
            System.out.print(stack1.pop());
        }

        System.out.println("-----------------------------------");
        System.out.println(fact(18));
        System.out.println("-----------------------------------");
        System.out.println(fib(2));
    }

    public static long fact(long n) {
        if (n == 0) return 1;
        else return fact(n-1) * n;
    }

    public static long fib(long n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}
