package com.basic;

import java.util.Scanner;

public class ArrayLeftrotate {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8,9, 10};
        System.out.println("Input Array : ");
        for(int i=0; i < arr.length; i++){
            System.out.println("Arr : "+ arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to rotate Array :");
        int userVal = sc.nextInt();

        for (int i=0; i < userVal; i++){
            int first = arr[0];
            for (int j=0; j< arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length -1] = first;
        }

        System.out.println("Output Array : ");
        for(int i=0; i < arr.length; i++){
            System.out.println("Arr : "+ arr[i]);
        }
    }
}
