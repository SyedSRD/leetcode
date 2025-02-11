package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int m = intervals.length;
        if(m == 0)
            return new int[][]{newInterval};

        int n = intervals[0].length;
        Map<Integer,int[]> output = new HashMap<>();
        int[][] km = new int[m+1][n];

        int ix=0;
        for(int[] i:intervals)
            km[ix++] = i;
        km[ix] = newInterval;

        Arrays.sort(km, (a, b) -> Integer.compare(a[0], b[0]));

        int outputInd = 0 ;
        output.put(outputInd, km[0]);
        for (int[] interval :km){
            int start = interval[0];
            int fin = interval[1];

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
