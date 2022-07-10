package com.competative.stack;

import java.util.Stack;

public class parathesisChecker {

    class Solution
    {
        //Function to check if brackets are balanced or not.
         boolean ispar(String x)
        {
            // add your code here

            Stack<Character> stack = new Stack<>();

            for (int i=0; i<x.length(); i++){
                char ch = x.charAt(i);

                // if opening bracket then stack push
                // if closing bracket stacktop top check and peek

                if(ch == '(' || ch == '[' || ch == '{'){
                    stack.push(ch);
                }else{
                    // closing bracket
                    if(!stack.isEmpty()){
                        char  stackTop = stack.peek();

                        if( (ch == ')' && stackTop == '(') || (ch == ']' && stackTop == '[')  || (ch == '}' && stackTop == '{' )){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }

            if(stack.isEmpty()){
                return true;
            }else{
                return false;
            }
        }
    }

}
