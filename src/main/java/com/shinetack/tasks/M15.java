package com.shinetack.tasks;

/*
8. В заданому масивi B(12) всi нульовi елементи замiнити максимальним
нульовим елементом, знайденим єз вiд'∙мних елементiв кратних 3. Вивести
перетворений масив, знайдений максимальний елемент та кiлькiсть нульових
елементiв.
*/

import com.shinetack.exceptions.ConditionsNotMetException;
import com.shinetack.exceptions.InappropriateSizeOfArrayException;
import com.shinetack.tasks.services.ServiceForM15;

public class M15 {
    public static ServiceForM15 changeArray(int[] array) {

        if (array.length != 12) {
            throw new InappropriateSizeOfArrayException();
        }

        int countZeroElements = 0;
        int maxNegativeNumber = Integer.MIN_VALUE;
        boolean numberExist = false;

        for(int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] % 3 == 0 && array[i] > maxNegativeNumber) {
                maxNegativeNumber = array[i];
                numberExist = true;
            }
        }

        if (!numberExist) {
            throw new ConditionsNotMetException();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZeroElements++;
                array[i] = maxNegativeNumber;
            }
        }

        return new ServiceForM15(array, countZeroElements, maxNegativeNumber);
    }
}
