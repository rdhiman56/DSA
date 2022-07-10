package com.basic;

import java.util.Scanner;

public class AutomorpicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Automorphic No. :: ");
        int num = sc.nextInt();
        int temp = num;
        int length = 0;
        /*
            int length = (""+num).length();
            System.out.println("Length of Number::"+ length);
        */

        //Length
        while (temp > 0){
            temp = temp / 10;
            length++;
        }
        System.out.println("Length of Number::"+ length);

        //Square
        int sq = num * num;
        System.out.println("Square of Number::"+ sq);

        // End of numbers
        int endDigit = sq % (int)Math.pow(10, length);
        System.out.println("endDigit::=> " + endDigit);

        if(endDigit == num){
            System.out.println("Number is Automorphic ");
        }else {
            System.out.println("Number is NOT Automorphic");
        }

    }
}
