package org.anicloud.colletion;

import java.util.*;
import java.util.Stack;

/**
 * Created by zhaoyu on 15-3-31.
 */
public class ComputeStringValue {

    public static String computeStringVal(String str) {
        String result = "";

        java.util.Stack<Character> characters = new Stack<Character>();
        char[] chars = str.toCharArray();
        List<Character> list = new ArrayList<Character>();

        for (char ch : chars) {
            list.add(ch);
        }

        ListIterator<Character> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            char ch = listIterator.next();
            if (ch == '+') {
                characters.add(listIterator.next());
            }
            else if (ch == '-') {
                char top = characters.pop();
                System.out.println(top);
                result += top;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s";
        String result = computeStringVal(str);
        System.out.println(result + ".");
    }

}
