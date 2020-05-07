package com.shinetack.tasks;

/*
8. В заданiй матрицi J(3,5) визначити найменший елемент серед непарних
додатнiх елементiв, що розмiщуються в стовпчиках з непарними iндексами.
Вивести найменший елемент i його iндекси.
*/

import com.shinetack.exceptions.InappropriateSizeOfMatrixException;

import java.util.Random;

public class M22 {

    private Random random = new Random();

    public String findResult(int[][] matrix) {
        if (matrix.length != 3 && matrix[0].length != 5) {
            throw new InappropriateSizeOfMatrixException();
        }
        int iResult = 0;
        int jResult = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j % 2 != 0 && matrix[i][j] % 2 != 0 && min > matrix[i][j]) {
                    iResult = i;
                    jResult = j;
                    min = matrix[i][j];
                }
            }
        }

        return new String("min["+ iResult +"]["+ jResult +"] = " + min);
    }

    private int[][] getMatrix() {

        int[][] matrix = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = random.nextInt();
            }
        }

        return matrix;
    }

    private void printResult(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("***");
        System.out.println(findResult(matrix));
    }

    public static void main(String[] args) {

        M22 m22 = new M22();

        for (int i = 0; i < 10; i++) {
            m22.printResult(m22.getMatrix());
        }
    }
}
