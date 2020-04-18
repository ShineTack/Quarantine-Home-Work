package com.shinetack.tasks;

import com.shinetack.exceptions.ConditionsNotMetException;
import com.shinetack.exceptions.InappropriateSizeOfArrayException;
import com.shinetack.tasks.services.ServiceForM15;
import org.junit.Assert;
import org.junit.Test;

public class M15Test {

    private int[] array1 = {1,0,3,4,0,-3,-6,-18,-10,9,0,11};
    private ServiceForM15 answer = new ServiceForM15(
      new int[] {1,-3,3,4,-3,-3,-6,-18,-10,9,-3,11},
      3,
      -3
    );

    private int[] array2 = {0,1,2,3,4,5,6,7,8,9,10,11};
    private int[] array3 = {0,1,2,3,4,5,6,7,8,9,10,11,12};

    @Test
    public void test1() {
        Assert.assertEquals(answer, M15.changeArray(array1));
    }

    @Test(expected = ConditionsNotMetException.class)
    public void test2() {
        M15.changeArray(array2);
    }

    @Test(expected = InappropriateSizeOfArrayException.class)
    public void test3() {
        M15.changeArray(array3);
    }
}
