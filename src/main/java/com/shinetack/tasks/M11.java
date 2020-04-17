package com.shinetack.tasks;

import com.shinetack.exceptions.InappropriateSizeOfArrayException;
import com.shinetack.exceptions.NumberNotExistException;

import java.util.HashMap;
import java.util.Map;

/*
 * 8. Визначити та вивести номер елемента в масивє A8(10), який дорєвнює
 * заданому числу B.
*/

public class M11 {

    public static int findIndexOfElementFromArray(int[] array, int number) {
        if(array.length != 10) {
            throw new InappropriateSizeOfArrayException();
        }

        for (int i = 1; i < array.length; i++) {
            if(array[i] == number) {
                return i;
            }
        }

        throw new NumberNotExistException();

    }
}
