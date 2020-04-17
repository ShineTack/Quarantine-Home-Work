package com.shinetack.tasks;

/*
* 8. Визначити і вивести максимальний елемент заданого масиву U(10) і його
* порядковий номер.
*/

import com.shinetack.exceptions.InappropriateSizeOfArrayException;

import java.util.HashMap;
import java.util.Map;

public class M13 {
    static public Map<String, Integer> findMaxElementAndItsIndexFromArray(int[] array) {
        if (array.length != 10) {
            throw new InappropriateSizeOfArrayException();
        }

        Map<String, Integer> answer = new HashMap<>();

        Integer maxElementIndex = 0;
        Integer maxElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxElementIndex = i;
            }
        }

        answer.put("maxElement", maxElement);
        answer.put("maxElementIndex", maxElementIndex);

        return answer;
    }
}
