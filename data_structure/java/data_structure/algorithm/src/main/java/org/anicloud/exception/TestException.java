package org.anicloud.exception;

/**
 * Created by zhaoyu on 15-4-1.
 */
public class TestException {

    public static void main(String[] args) throws Exception {

        try {
            int a = 10, b = 0;
            if (b == 0) {
                throw new Exception("zero exits.");
            }
            int r = a / b;
            System.out.println(r);
        } catch (ArithmeticException e) {
            System.out.println("catch.");
        } finally {
            System.out.println("finally.");
        }

    }

}
