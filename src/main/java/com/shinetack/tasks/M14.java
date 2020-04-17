package com.shinetack.tasks;

/*
8. Для заданого масиву X(10) потрiбно визначити чи ∙ вiн
упорядкованим за зменшенням, тобто для кожноi пари сусiднiх
елементiв повинна виконуватися умова: Х(i)>Х(i+1), де i=1,2...9.
Вивести на екран заданий масив та вiдповiдне повiдомлення.
*/

import com.shinetack.exceptions.InappropriateSizeOfArrayException;

public class M14 {
    public static boolean checkOrderingByDecreasingElementsOfArray(int[] array) {

        if (array.length != 10) {
            throw new InappropriateSizeOfArrayException();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
