package org.example;

import java.util.Arrays;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {

        if(s.length()<3 || numRows == 1)
            return s;

        String[] zigzagArray = new String[numRows];
        Arrays.fill(zigzagArray,"");
        int row = 0,i=0;
        StringBuilder nstring = new StringBuilder();
        while (i<s.length()){
            zigzagArray[row++] += s.charAt(i++);
            if(row == numRows-1){
                while(row!=0 && i<s.length())
                    zigzagArray[row--] += s.charAt(i++);
            }
        }

        for (int j=0;j<numRows;j++)
          nstring.append(zigzagArray[j]);

        return nstring.toString();
    }
}
