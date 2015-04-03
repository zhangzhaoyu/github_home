package org.anicloud.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by zhaoyu on 15-3-31.
 */
public class ArraysAndCollectionsUtilsTest {

    @Test
    public void testArraysAndCollectionsLib() {
        Collection<Integer> collections = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Integer[] moreInts = {9, 10};

        Collections.addAll(collections, moreInts);
        System.out.println(collections);

    }

    @Test
    public void testList() {
        System.out.println("let do it");
    }

    public void testIterator() {

    }


}
