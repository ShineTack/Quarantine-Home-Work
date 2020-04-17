package com.shinetack.tasks;

import com.shinetack.exceptions.InappropriateSizeOfArrayException;
import org.junit.Test;

public class M14Test {

    private int[] array1 = {9,8,7,6,5,4,3,2,1,0};
    private int[] array2 = {0,1,2,3,4,5,6,7,8,9};
    private int[] array3 = {10,9,8,7,6,5,4,3,2,1,0};

    @Test
    public void test1() {
        org.junit.Assert.assertEquals(true, M14.checkOrderingByDecreasingElementsOfArray(array1));
    }

    @Test
    public void test2() {
        org.junit.Assert.assertEquals(false, M14.checkOrderingByDecreasingElementsOfArray(array2));
    }

    @Test(expected = InappropriateSizeOfArrayException.class)
    public void test3() {
        M14.checkOrderingByDecreasingElementsOfArray(array3);
    }
}
