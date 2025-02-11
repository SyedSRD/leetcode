package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arraylist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++) {
            if(i>0 && nums[i] == nums[i-1])
                continue;
            for (int j = i + 1; j < nums.length - 1; j++)

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list);
                        if (!arraylist.contains(list))
                            arraylist.add(list);
                    }
                }
        }
//        System.out.println(Arrays.toString(nums));
//        int l,r,threeSum;
//        for (int i=0;i<nums.length-2;i++){
//            if(i>0 && nums[i] == nums[i-1])
//                continue;
//            l = i+1;
//            r = nums.length-1;
//            while (l<r) {
//                threeSum = nums[i] + nums[l] + nums[r];
//                if (threeSum > 0)
//                    r--;
//                else if (threeSum < 0)
//                    l++;
//                else {
//                    arraylist.add(Arrays.asList(nums[i], nums[l], nums[r]));
//                    l++;
//                    while (l<r && nums[l] == nums[l - 1])
//                        l++;
//                }
//            }
//        }


        return arraylist;
    }
}
