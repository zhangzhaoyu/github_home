package org.anicloud.colletion;

import java.util.*;
import java.util.Stack;

/**
 * Created by zhaoyu on 15-3-31.
 */
public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        java.util.Stack<Integer> stack = new Stack<Integer>();
        for (int i=1; i<10; i++) {
            queue.add(i);
            stack.push(i);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        System.out.println("--------------------");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }

}
