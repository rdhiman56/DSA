package com.practice.collection.List;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        List<String> stack = new Stack<String>();

        stack.add("stack1");
        stack.add("stack2");
        stack.add("stack3");
        stack.add("stack4");
        stack.add("stack5");

        System.out.println("Stack data:=> "+ stack);

        //Loop
        for(int i=0; i< stack.size(); i++){
            System.out.println("Loop:=> "+ stack.get(i));
        }
    }
}
