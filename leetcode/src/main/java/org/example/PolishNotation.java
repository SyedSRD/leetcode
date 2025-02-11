package org.example;

import java.util.Stack;

public class PolishNotation {

    public static int evalRPN(String[] tokens) {

        Stack<String>  stack = new Stack<>();

        for(String str : tokens){
            switch (str){
                case "+"  : {
                    stack.push(String.valueOf(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop())));
                    break;
                }
                case "-"  : {
                    int b = Integer.parseInt(stack.pop());
                    int a = Integer.parseInt(stack.pop());
                    int c = a-b;
                    stack.push(String.valueOf(c));
                    break;
                }
                case "/"  : {
                    int b = Integer.parseInt(stack.pop());
                    int a = Integer.parseInt(stack.pop());
                    int c = a/b;
                    stack.push(String.valueOf(c));
                    break;
                }
                case "*"  : {

                    stack.push(String.valueOf(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop())));
                    break;
                }
                default:stack.push(str);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
