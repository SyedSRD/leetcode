package org.example;

import java.util.Arrays;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        System.out.println(Arrays.toString(numbers));
        int l,r,tSum;

        l = 0;
        r = numbers.length-1;
        while (l<r) {
            tSum = numbers[l] + numbers[r];
            if (tSum > target)
                r--;
            else if (tSum < target)
                l++;
            else
                break;

        }

        return new int[]{l+1,r+1};

    }
}
