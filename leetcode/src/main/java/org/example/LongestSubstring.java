package org.example;

import java.util.Arrays;

public class LongestSubstring {



    public int lengthOfLongestSubstring(String s) {
         int[] alphaNumricArray = new int[256];
         int maxCount = 0;
         int right = 0, left =0;

        if(s.isEmpty())
            return 0;
        if(s.length() == 1)
            return 1;

        while(right < s.length()){

            if(alphaNumricArray[s.charAt(right)] == 1){

                while(alphaNumricArray[s.charAt(right)] != 0){
                    alphaNumricArray[s.charAt(left)] = 0;
                    left++;
                }
            }
            alphaNumricArray[s.charAt(right)] = 1;

            maxCount = Math.max(maxCount, (right- left +1));

            right++;



        }

        return maxCount;

    }
}
