package org.example;

import java.util.ArrayList;
import java.util.List;

public class RotateImage {
    public void rotate(int[][] matrix) {

        int tmp1,tmp2, k = 0, l = 0;

        int m = matrix.length, n = matrix[0].length;

        for (int ro=0;ro<m-1;ro++){
            for (int col = ro; col < n-1;col++){
                tmp1 = matrix[ro][col];
                tmp2 = matrix[col][n-1];
                matrix[col][n-1] = tmp1 ;
                tmp1 = matrix[m-1][n-1-col];
                matrix[m-1][n-1-col] = tmp2;
                tmp2 = matrix[m-1-col][ro];
                matrix[m-1-col][ro] = tmp1;
                matrix[ro][col] = tmp2;
            }
            m--;
            n--;
        }

    }

}
