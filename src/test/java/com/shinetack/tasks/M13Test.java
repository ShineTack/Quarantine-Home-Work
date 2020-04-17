package com.shinetack.tasks;

import com.shinetack.exceptions.InappropriateSizeOfArrayException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class M13Test {

    private int[] array1 = {1,2,3,4,5,6,7,8,9,10};
    private Map<String, Integer> answer = new HashMap<String, Integer>(){{
       put("maxElement", 10);
       put("maxElementIndex", 9);
    }};

    private int[] array2 = {1,2,3,4,5,6,7,8,9};

    @Test
    public void test1() {
        org.junit.Assert.assertEquals(answer, M13.findMaxElementAndItsIndexFromArray(array1));
    }

    @Test(expected = InappropriateSizeOfArrayException.class)
    public void test2() {
        M13.findMaxElementAndItsIndexFromArray(array2);
    }
}
