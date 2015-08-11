package org.anicloud.datastructure.chapter05;

import java.util.Stack;

/**
 * Created by zhaoyu on 15-8-10.
 */
public class BinaryToTen {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String binaryStr = "11";
        for (int i = 0; i < binaryStr.length(); i++) {
            stack.push(Integer.parseInt(binaryStr.substring(i, i+1)));
        }

        int sum = 0;
        int i = 0;
        while (!stack.empty()) {
            int temp = stack.pop();
            sum += temp * Math.pow(2, i);
            i++;
        }
        System.out.println("ten number is :" + sum);
    }
}
