package com.competative.stack;

import java.util.Stack;

public class reverse_statement {

    // Function to reverse the words
    // of the given String without
    // using strtok().
    static void reverse (String s){

        // Create an empty String stack
        Stack<String> stack = new Stack<>();

        // Create an empty temporary String
        String word = "";

        // Traversing the entire String
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                // Push the temporary
                // variable into the stack
                stack.add(word);

                // Assigning temporary
                // variable as empty
                word = " ";
            }else
            {
                word = word + s.charAt(i);
            }
        }

        // For the last word
        // of the String
        stack.add(word);

        // Get the words in
        // reverse order
        while (!stack.isEmpty()){
            // Get the words in
            // reverse order
            word = stack.peek();
            System.out.print(word + " ");
            stack.pop();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String s = "Hey, how are you doing?";
        reverse(s);
    }
}
