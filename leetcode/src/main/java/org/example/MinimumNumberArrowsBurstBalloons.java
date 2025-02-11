package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumNumberArrowsBurstBalloons {
    public int findMinArrowShots(int[][] intervals) {
        int m = intervals.length, n = intervals[0].length;
        if(m == 1)
            return intervals.length;
        Map<Integer,int[]> output = new HashMap<>();


        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int outputInd = 0, count=0 ;
        output.put(outputInd, intervals[0]);
        for (int[] interval :intervals){
            int start = interval[0];
            int fin = interval[1];

            int lastfin = output.get(outputInd)[1];
            if(start <= lastfin) {
                output.get(outputInd)[1] = Math.max(lastfin, fin);
                count++;
            }
            else {
                output.put(++outputInd, new int[]{start, fin});
                count++;
            }


        }
        int[][] k = new int[output.values().size()][2];
        int i =0;
        for(int[] m1: output.values())
            k[i++] = m1;

        return count;
    }
}
