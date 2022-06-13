package com.jap.insertionsort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class InsertionSortTest
{
    InsertionSort insertionSort;
    int[] rollNos;
    @Before
    public void setUp(){
        insertionSort = new InsertionSort();
        rollNos = new int[]{102,100,101,103,109,110,111,132,105,108};
    }

    @After
    public void tearDown(){
        insertionSort = null;
        rollNos  = null;
    }

    @Test
    public void givenAnArrayReturnInSortedOrder(){
        assertArrayEquals(new int[]{100,101,102,103,105,108,109,110,111,132},insertionSort.insertionSort(rollNos));
        assertArrayEquals(new int[]{100,101,102,103,105,108,109,110,111,132},insertionSort.insertionSort(new int[]{100,101,102,103,105,108,109,110,111,132}));
    }
}
