package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsString {
    public String reverseWords(String s) {
        String[] rvStringArray = s.split(" ");
        StringBuilder rvString = new StringBuilder();
        System.out.println(Arrays.toString(rvStringArray));
        for (int i=rvStringArray.length - 1; i >= 0; i--)
            if(!rvStringArray[i].isEmpty())
                 rvString.append(rvStringArray[i]+" ");

        return rvString.toString().trim();

//        String str[] = s.split(" ");
//        Collections.reverse(Arrays.asList(str));
//        return String.join(" ", str);

//        StringBuilder ans=new StringBuilder();
//
//        String temp = "";
//        for(int i=0;i<s.length();i++)
//        {
//            char ch = s.charAt(i);
//            if(ch==' ' || i == s.length() - 1)
//            {
//                //if we find white space add temp in the start
//                if(!temp.equals(""))
//                    //adding in the front every time
//                    ans.insert(0,temp+" ");
//
//                temp = "";
//            }
//            else
//                temp += ch;
//        }
//        if(!temp.equals(""))
//            ans.insert(0,temp+" ");

//        return ans.toString().trim();

    }
}
