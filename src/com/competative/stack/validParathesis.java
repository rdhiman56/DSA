package com.competative.stack;

import java.util.Stack;

public class validParathesis {
    class Solution
    {
        boolean valid(String s)
        {
            // code here

            Stack<Character> stack = new Stack<Character>();

            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);


                if(ch == '(' || ch == '[' || ch == '{' ){
                    stack.push(ch);
                }else{
                    if(!stack.isEmpty()){
                        if( (ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[')  || (ch == '}' && stack.peek() == '{' )){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }

            if(stack.isEmpty()) {
                return true;
            }else{
                return false;
            }

        }
    }
}
