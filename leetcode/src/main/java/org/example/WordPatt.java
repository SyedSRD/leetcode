package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordPatt {

    public boolean wordPattern(String pattern, String s) {

        if (pattern.length()!= s.split(" ").length)
            return false;

        Map isomophicMap = new HashMap<Character,String>();

        String str = "a";
        for (int i = 0; i < pattern.length(); i++) {
            if (isomophicMap.containsKey(pattern.charAt(i))) {
                str = (String) isomophicMap.get(pattern.charAt(i));
                if (!str.equals(s.split(" ")[i]))
                    return false;
            }
            else if (!isomophicMap.containsValue(s.split(" ")[i])) {
                isomophicMap.put(pattern.charAt(i), s.split(" ")[i]);
            }
            else {
                return false;
            }
        }
        return true;
    }

}
