package com.practice.basic;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sunny Number :: ");
        int num = sc.nextInt();
        double sq, decimal;

        sq = Math.sqrt(num+1);
        decimal = sq - Math.floor(sq);

        if(decimal == 0.0){
            System.out.println("Sunny No.");
        }else {
            System.out.println("its not Sunny No.");
        }
    }
}
