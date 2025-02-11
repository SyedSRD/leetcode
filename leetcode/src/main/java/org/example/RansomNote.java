package org.example;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {



    public boolean canConstruct(String ransomNote, String magazine) {
        Map magazineMap = new HashMap<String,Integer>();
        for(char ch: magazine.toCharArray()) magazineMap.put(ch, (int) magazineMap.getOrDefault(ch,0)+1);

        for(char ch: ransomNote.toCharArray()){
            if(!(magazineMap.containsKey(ch)) || (int) magazineMap.get(ch) == 0)
               return false;
            magazineMap.put(ch, (int) magazineMap.get(ch)-1);

        }

        return true;
    }
}
