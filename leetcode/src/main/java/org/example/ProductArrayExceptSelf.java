package org.example;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            System.out.print("0");
            return nums;
        }

        int i, temp = 1;

        /* Allocate memory for the product array */
        int prod[] = new int[n];

        /* Initialize the product array as 1 */
        for (int j = 0; j < n; j++)
            prod[j] = 1;

        /* In this loop, temp variable contains product of
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= nums[i];
        }

        /* Initialize temp to 1 for product on right side */
        temp = 1;

        /* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= nums[i];
        }

        System.out.println(Arrays.toString(nums));
        return prod;
    }
}
