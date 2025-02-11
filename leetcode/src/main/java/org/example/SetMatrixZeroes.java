package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {


        int m = matrix.length, n = matrix[0].length;
        Map<Integer,Integer[]> map = new HashMap<>();

        int count = 0;
        for (int ro=0;ro<m-1;ro++){
            for (int col = 0; col < n-1;col++){
                if(matrix[ro][col] == 0)
                    map.put(count++,new Integer[]{ro,col});
            }
        }
        int ro;
        for (int col =0 ; col<n;col++){
            int finalCol = col;
            Integer[] arr = map.values().stream().filter(k -> k[1]== finalCol).findAny().get();
                ro = arr[0];
                for (int j = 0; j < n - 1; j++)
                    matrix[ro][j] = 0;
                for (int i = 0; i < m - 1; i++)
                    matrix[i][col] = 0;

        }


    }
}
