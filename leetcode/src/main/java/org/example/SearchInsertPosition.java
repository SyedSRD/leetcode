package org.example;

public class SearchInsertPosition {
        static int[] num;
        static int target1;
    static public int searchInsert(int[] nums, int target) {
        int high,lo,mid;
        num = nums;
        target1 = target;
        lo = 0;
        high = nums.length-1;
        mid = (high-lo)/2;

        return  binarySearch( high,  lo,  mid);


    }

   static public int binarySearch(int high, int lo, int mid){
        if(num[mid] == target1)
            return mid;
        if(lo>=high)
            return lo+1;


        if(target1 < num[mid])
            high = mid -1 ;
        else
            lo = mid + 1;

        mid = (high + lo)/2;
        return binarySearch(high,lo,mid);

    }
}
