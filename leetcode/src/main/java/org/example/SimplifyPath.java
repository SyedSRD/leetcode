package org.example;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack stack = new Stack();
        String str1 = "";
        for (char ch : path.toCharArray() ){
            if(ch == '/'){
                if(str1.equals(".."))
                    if (!stack.isEmpty())
                        stack.pop();
                    else if (!str1.equals("") && !str1.equals("."))
                        stack.push(str1);
                str1 = "";

            }
            else str1 += ch;

        }

        return (String) stack.stream().map(s -> s.toString()).collect(Collectors.joining("/"));
    }




}
