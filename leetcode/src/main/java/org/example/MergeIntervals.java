package org.example;

import java.util.*;

public class MergeIntervals {
//    Input: intervals = [[1,3],
//                        [2,6],
//                        [8,10],
//                        [15,18]]
//    Output: [[1,6],[8,10],[15,18]]
//    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
    public int[][] merge(int[][] intervals) {

        int m = intervals.length, n = intervals[0].length;
        if(m == 1)
            return intervals;
        Map<Integer,int[]> output = new HashMap<>();


        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int outputInd = 0 ;
        output.put(outputInd, intervals[0]);
        for (int[] interval :intervals){
            int start = interval[0];
            int fin = interval[1];
            System.out.println(outputInd);
            System.out.println(output.toString());
            int lastfin = output.get(outputInd)[1];
            if(start <= lastfin)
                output.get(outputInd)[1] = Math.max(lastfin,fin);
            else
                output.put(++outputInd,new int[]{start,fin});

        }
        int[][] k = new int[output.values().size()][2];
        int i =0;
        for(int[] m1: output.values())
            k[i++] = m1;

        return k;
    }
}
