package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map  numMap = new HashMap<Integer,Integer>();
        int diff;
        int[] rs = new int[2];
        for(int i=0;i<nums.length;i++)
            numMap.put(nums[i], i);

        for(int j=0;j<nums.length;j++){
            diff = target - nums[j];
//            if(diff < 0)
//                continue;
            if(numMap.containsKey(diff) && (int) numMap.get(diff) != j) {
                rs[0] = j;
                rs[1] = (int) numMap.get(diff);
                break;
            }
        }
        System.out.println();
        return rs;
    }

}
