package org.example;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map numMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            if((int)numMap.getOrDefault(nums[i],-1) != -1) {
               if(i - (int)numMap.get(nums[i]) <= k)
                    return true;
            }
            numMap.put(nums[i],i);
        }


        return false;
    }
}
