package org.anicloud.colletion;

import java.util.LinkedList;

/**
 * Created by zhaoyu on 15-3-31.
 */
public class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T t) {
        this.storage.addFirst(t);
    }

    public T peek() {
        return this.storage.getFirst();
    }

    public T pop() {
        return this.storage.removeFirst();
    }

    public boolean empty() {
        return this.storage.isEmpty();
    }

    public String toString() {
        return this.storage.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i=1; i<10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

}
