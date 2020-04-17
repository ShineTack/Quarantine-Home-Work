package com.shinetack.tasks;

import com.shinetack.exceptions.InappropriateSizeOfArrayException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class M12Test {

    private int[] array1 = {1,2,3,4,5,6,7,8,9,0,10};
    private double answer = 3.0;

    private int[] array2 = {1,2,3,4,5,6,7,8,9};

    @Test
    public void test1() {
        assertEquals(answer, M12.calculatePairedElementsOfArray(array1), 100);
    }

    @Test(expected = InappropriateSizeOfArrayException.class)
    public void test2() {
        M12.calculatePairedElementsOfArray(array2);
    }
}
