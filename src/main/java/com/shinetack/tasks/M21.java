package com.shinetack.tasks;

/*
8. В заданiй матрицi E(8,2) знайти добуток вiд'∙мних елементiв. 
Вивести вихiдну матрицю та добуток вiд'∙мних елементiв.
*/

import com.shinetack.exceptions.InappropriateSizeOfMatrixException;
import com.shinetack.tasks.services.ServiceForM21;

public class M21 {
    public static ServiceForM21 findResult(int[][] matrix) {

        if (matrix.length != 8 && matrix[0].length != 2) {
            throw new InappropriateSizeOfMatrixException();
        }

        int result = 1;

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < 0) {
                    result *= matrix[i][j];
                }
            }
        }

        return new ServiceForM21(matrix, result);
    }
}
