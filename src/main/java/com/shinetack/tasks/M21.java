package com.shinetack.tasks;

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
