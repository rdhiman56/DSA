package com.practice.Arrays;

public class evenElementArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array");

        for (int i=0; i< arr.length; i=i+2){
            System.out.println("index ["+i+"]" + arr[i]);
        }
    }
}
