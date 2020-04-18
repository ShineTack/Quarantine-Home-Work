package com.shinetack.tasks.services;

/*
8. В заданому масивi B(12) всi нульовi елементи замiнити максимальним
нульовим елементом, знайденим єз вiд'∙мних елементiв кратних 3. Вивести
перетворений масив, знайдений максимальний елемент та кiлькiсть нульових
елементiв.
*/

import com.shinetack.tasks.M15;

import java.util.Arrays;
import java.util.Objects;

public class ServiceForM15 {

    private int[] array;
    private int countZeroElements;
    private int maxNegativeNumber;

    public ServiceForM15(int[] array, int countZeroElements, int maxNegativeNumber) {
        this.array = array;
        this.countZeroElements = countZeroElements;
        this.maxNegativeNumber = maxNegativeNumber;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getCountZeroElements() {
        return countZeroElements;
    }

    public void setCountZeroElements(int countZeroElements) {
        this.countZeroElements = countZeroElements;
    }

    public int getMaxNegativeNumber() {
        return maxNegativeNumber;
    }

    public void setMaxNegativeNumber(int maxNegativeNumber) {
        this.maxNegativeNumber = maxNegativeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceForM15 that = (ServiceForM15) o;
        return countZeroElements == that.countZeroElements &&
                maxNegativeNumber == that.maxNegativeNumber &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(countZeroElements, maxNegativeNumber);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
