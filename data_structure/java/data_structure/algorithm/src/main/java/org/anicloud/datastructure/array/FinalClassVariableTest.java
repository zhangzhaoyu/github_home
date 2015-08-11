package org.anicloud.datastructure.array;

/**
 * Created by zhaoyu on 15-7-20.
 */
public class FinalClassVariableTest {
    final static int var1 = "crazy java".length();
    final static int var2;

    static {
        var2 = "light Java EE".length();
    }

    public static void main(String[] args) {
        System.out.println(FinalClassVariableTest.var1);
        System.out.println(FinalClassVariableTest.var2);
    }

}
