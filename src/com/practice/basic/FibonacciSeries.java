package com.practice.basic;

public class FibonacciSeries {
    // fibonacci series 0, 1, 1, 2, 3, 5......
    public static void main(String[] args) {
        int x = 0, y = 1, z ,n=10;
        for(int i=0; i<n; i++){
            z = x + y;
            System.out.println("Fibonacci ["+i+"] :: " + z);
            x = y;
            y = z;
        }
    }
}
