package com.shinetack.tasks.services;

import java.util.Arrays;
import java.util.Objects;

public class ServiceForM21 {

    private int[][] matrix;
    private int result;

    public ServiceForM21(int[][] matrix, int result) {
        this.matrix = matrix;
        this.result = result;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceForM21 that = (ServiceForM21) o;
        return result == that.result &&
                Arrays.equals(matrix, that.matrix);
    }

    @Override
    public int hashCode() {
        int result1 = Objects.hash(result);
        result1 = 31 * result1 + Arrays.hashCode(matrix);
        return result1;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ServiceForM21{" +
                "matrix=" + Arrays.toString(matrix) +
                ", result=" + result +
                '}';
    }
}
