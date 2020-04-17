package com.shinetack.tasks;

import com.shinetack.exceptions.InappropriateSizeOfArrayException;
import com.shinetack.exceptions.NumberNotExistException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class M11Test {

    private int askedNumber = 0;

    private int[] array1 = {1,3,5,2,4,9,7,8,0,11};
    private int answer1 = 8;

    private int[] array2 = {1,2,3,4,5};

    private int[] array3 = {1,1,2,3,4,5,6,7,8,9};

    @Test
    public void test1() {
        assertEquals(answer1, M11.findIndexOfElementFromArray(array1, askedNumber));
    }

    @Test(expected = InappropriateSizeOfArrayException.class)
    public void test2(){
        M11.findIndexOfElementFromArray(array2, askedNumber);
    }

    @Test(expected = NumberNotExistException.class)
    public void test3(){
        M11.findIndexOfElementFromArray(array3, askedNumber);
    }
}
