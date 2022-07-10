package com.competative.stack;

import java.util.Stack;

public class reverseString_Stack {

        Stack<Character> st;

        reverseString_Stack() {
            st = new Stack<>();
        }

        public String reverse(String S){
            //code here
            String revStr = "";

            for(int i =0; i < S.length(); i++){
                st.push(S.charAt(i));
            }

            while(!st.isEmpty()){
                revStr += st.pop();
            }

            return revStr;
        }


        // 2nd

/*
        Stack<Character> st = new Stack<>();

        public String reverse(String S){
            //code here
            String revStr = "";

            for(int i =0; i < S.length(); i++){
                st.push(S.charAt(i));
            }

            while(!st.isEmpty()){
                revStr += st.pop();
            }

            return revStr;
        }
        */
}
