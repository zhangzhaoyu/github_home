package org.anicloud.exception;


/**
 * Created by zhaoyu on 15-4-1.
 */

class ThreeException extends Exception {

}

public class FinallyWorks {

    static int count = 0;

    public static void main(String[] args) {
        while (Boolean.TRUE) {
            try {
                if (count++ == 0) {
                    throw new ThreeException();
                }
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause.");
                if (count == 2) {
                    break;
                }
            }
        }
        lostException();
    }

    public static void lostException() {
        System.out.println("call lostException func.");
        try {
            throw new RuntimeException("lost exception");
        } finally {
            return;
        }
    }

}
