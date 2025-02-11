package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        if(nums.length == 0)
            return new ArrayList<>();

        List<String> lst = new ArrayList<>();
        int rangeStart = 0,rangeEnd = 0,i;

        for(i=1;i<nums.length;i++){
            if( nums[rangeEnd]+1 == nums[i]  ) {
                rangeEnd++;
                continue;
            }
            if (rangeStart == rangeEnd) {
                lst.add(String.valueOf(nums[rangeStart]));
            }
            else {
                lst.add((nums[rangeStart]) + "->" + (nums[rangeEnd]));
            }
            rangeStart = i;
            rangeEnd = i;

        }

        if (rangeStart == rangeEnd) {
            lst.add(String.valueOf(nums[rangeStart]));
        }
        else {
            lst.add((nums[rangeStart]) + "->" + (nums[rangeEnd]));
        }

        return lst;
    }
}
