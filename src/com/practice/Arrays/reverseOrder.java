package com.practice.Arrays;

public class reverseOrder {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array");
        for(int i=0; i < arr.length; i++){
            System.out.println("" + arr[i]);
        }

        System.out.println(" Array in reverse Order");
        for(int j=arr.length-1; j>=0; j--){
            System.out.println("" + arr[j]);
        }
    }
}
