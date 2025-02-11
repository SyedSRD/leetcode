package org.example;

import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int k : nums) {
            set.add(k);
        }

        int count = 1;
        int max = 0;
        for(int k: nums){
            if(set.contains(k-1))
                continue;
            while (set.contains(k+count)) {
                set.remove(k+count);
                count++;
            }
            max = Math.max(max, count);
        }

        return max;


    }
}
