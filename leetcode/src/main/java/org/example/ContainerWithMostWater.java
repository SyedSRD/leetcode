package org.example;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int l = 0,r=height.length-1,max =0,a ;
        while (l<r) {
            a = (r-l) * Math.min(height[l],height[r]);
            max = Math.max(max,a);

            if (height[r]>height[l])
                l++;
            else
                r--;
        }

        return max;
    }
}
