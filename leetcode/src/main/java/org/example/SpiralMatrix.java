package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        int i, k = 0, l = 0;
        List<Integer> list = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;

        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */

        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                //System.out.print(a[k][i] + " ");
                list.add(matrix[k][i]);
            }
            k++;

            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                // System.out.print(a[i][n - 1] + " ");
                list.add(matrix[i][n-1]);
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    //System.out.print(a[m - 1][i] + " ");
                    list.add(matrix[m-1][i]);
                }
                m--;
            }

            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    //System.out.print(a[i][l] + " ");
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;

    }
}
