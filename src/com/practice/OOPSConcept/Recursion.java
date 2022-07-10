package com.practice.OOPSConcept;

public class Recursion {
    // Recursion
    public static void main(String[] args) {
        //sout
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int y){
        if(y > 0){
            return y + sum(y -1);
        }else{
            return 0;
        }
    }
}
