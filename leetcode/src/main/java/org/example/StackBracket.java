package org.example;

import java.util.*;

public class StackBracket {


    public boolean isValid(String s){
        if(s.isEmpty() )
            return true;

        char popVar;
        Deque<Character> stack = new ArrayDeque<>();
        Map numMap = new HashMap<Character,Character>();
        numMap.put( ')','(');
        numMap.put( ']','[');
        numMap.put( '}','{');

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{' ) {
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty())
                return false;
            popVar = stack.pop();
            if((char) numMap.getOrDefault(ch,'0') != popVar)
                return false;

        }
        return stack.isEmpty();
    }
}
