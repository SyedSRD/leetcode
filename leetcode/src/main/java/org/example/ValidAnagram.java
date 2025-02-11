package org.example;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return  false;

        int[] strArray = new int[26];
        for(char ch: s.toCharArray())
            strArray[ch-'a']++;
        for(char ch2: t.toCharArray())
            strArray[ch2-'a']--;
        for(int a:strArray)
            if(a != 0)
                return false;
        return true;

    }
}
