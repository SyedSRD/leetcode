package org.example;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap();
        List<List<String>> arrayList = new ArrayList<>();
        if(strs.length == 0)
            return arrayList;


        for(String str:strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String nstring = new String(strArray);
            if(!map.containsKey(nstring))
                map.put(nstring,new ArrayList<>());
            map.get(nstring).add(str);

        }

        arrayList.addAll(map.values());

        return arrayList;
    }
}
