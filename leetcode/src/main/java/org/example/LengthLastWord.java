package org.example;

public class LengthLastWord {

    public int lengthOfLastWord(String s) {
        String[] st = s.split(" ");
        return st[st.length-1].length();
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prxStr = new StringBuilder(strs[0]);

        for(String st: strs){
            if(st.isEmpty() || prxStr.toString().isEmpty() )
                return "";

            while (!st.contains(prxStr.toString()) || st.indexOf(prxStr.toString())>0 )
                prxStr.deleteCharAt(prxStr.length()-1);


        }
        return prxStr.toString();
    }
}
