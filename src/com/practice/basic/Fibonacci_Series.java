package com.practice.basic;

public class Fibonacci_Series {
    public static void main(String args[]){
        // Fibonacci Series : WITH SWAPPING
        // 0, 1, 1, 2, 3, 5, 8 ......
        int x = 0, y = 1;
        int z;
        for(int i=1; i <= 10; i++){
            z = x +y;
            System.out.println("Fibonacci Series:=> "+ z);
            x = y;
            y= z;
        }
    }
}
