package org.anicloud.colletion;

import java.util.*;

/**
 * Created by zhaoyu on 15-3-31.
 */
public class IterationDemo {

    public static void main(String[] args) {
        Collection<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        display(list.iterator());

        listIteration();
        linkedList();
    }



    public static void display(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void listIteration() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        ListIterator<Integer> listIt = list.listIterator();

        while (listIt.hasNext()) {
            System.out.print(listIt.next() + ", ");
        }
    }
    public static void linkedList() {

        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("----------------");
        System.out.println(linkedList.peek());
        System.out.println(linkedList.element());

    }

}
