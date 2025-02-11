package org.example;

import java.util.*;

public class CourseSchedule {

    Map<Integer, List<Integer>> map;
    Set<Integer> visitingSet;
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        map = new HashMap<>();
        visitingSet = new HashSet<>();

        for( int[] prerequisite : prerequisites ) {
            if (!map.containsKey(prerequisite[0]))
                map.put(prerequisite[0], new ArrayList<>());
            map.get(prerequisite[0]).add(prerequisite[1]);
        }

        for( Integer node: map.keySet() ){

            if(!dfs(node))
                return false;
        }

        return true;
    }

    public boolean dfs(Integer node) {

        if (map.get(node) == null)
            return true;
        if(visitingSet.contains(node))
            return false;

        visitingSet.add(node);
        for( Integer edge : map.get(node) ) {
            if (!dfs(edge))
                return false;

        }
        visitingSet.remove(node);
        map.get(node).clear();
        return true;
    }

}
