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

    public static void main(String[] args) {
        System.out.println(calculatePairedElementsOfArray(new int[] {1,2,3,4,5,6,7,8,9,0,10}));
    }
}
