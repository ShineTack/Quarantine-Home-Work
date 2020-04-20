package com.shinetack.tasks;

import com.shinetack.tasks.services.ServiceForM21;
import org.junit.Test;

import java.util.Random;

public class M21Test {

    private int[][] generateMatrix() {
        int[][] matrix = new int[8][2];

        Random random = new Random(-100);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = random.nextInt();
            }
        }

        return matrix;
    }

    private int calculate(int[][]matrix) {
        int result = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                if (matrix[i][j] < 0) {
                    result *= matrix[i][j];
                }
            }
        }

        return result;
    }

    @Test
    public void test1 () {
        for (int i = 0; i < 100; i++) {
            int [][] matrix = generateMatrix();
            int result = calculate(matrix);
            ServiceForM21 service = new ServiceForM21(matrix, result);

            org.junit.Assert.assertEquals(service, M21.findResult(matrix));
        }
    }
}
