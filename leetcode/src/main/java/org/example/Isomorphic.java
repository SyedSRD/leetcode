package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map isomophicMap = new HashMap<Character,Character>();

        char c = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (isomophicMap.containsKey(s.charAt(i))) {
                c = (char) isomophicMap.get(s.charAt(i));
                if (c != t.charAt(i))
                    return false;
            }
            else if (!isomophicMap.containsValue(t.charAt(i))) {
                isomophicMap.put(s.charAt(i), t.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }

}
