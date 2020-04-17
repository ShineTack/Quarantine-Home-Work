package com.shinetack.tasks;

import com.shinetack.exceptions.InappropriateSizeOfArrayException;

/*
* 8. Обчислити та вивести середнє арифметичне парних елементiв масиву N(11).
* */

public class M12 {
    public static double calculatePairedElementsOfArray(int[] array) {

        if (array.length != 11) {
            throw new InappropriateSizeOfArrayException();
        }

        int average = 0;

        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                average += array[i];
            }
        }

        return average / array.length;
    }
    
}
