package org.example;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    Map<Integer,Integer> DP = new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        if(DP.containsKey(n))
            return DP.get(n);
        if(n<3) {
            DP.put(n,n);
            return n;
        }
        DP.put(n,climbStairs(n-1)+climbStairs(n-2));
        return DP.get(n);
    }
}
