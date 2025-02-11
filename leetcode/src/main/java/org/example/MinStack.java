package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    int minVal;
    public MinStack() {

        stack = new Stack<>();
        minStack = new Stack<>();
        minVal = Integer.MAX_VALUE;

    }

    public void push(int val) {
        minVal = Math.min(minVal,val);
        stack.push(val);
        minStack.push(minVal);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
        minVal = minStack.isEmpty()?Integer.MAX_VALUE:minStack.peek();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minVal;
    }
}
