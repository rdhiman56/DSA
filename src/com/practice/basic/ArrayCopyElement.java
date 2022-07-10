package com.practice.basic;

public class ArrayCopyElement {
    public static void main(String[] args) {
        int [] arr1 = {1, 45, 29, 56, 12};
        int [] arr2 = arr1;

        for (int i=0; i < arr1.length; i++){
            System.out.println("Arr length::=> " + arr1[i]);
        }

        for (int i=0; i < arr2.length; i++){
            System.out.println("Arr length::=> " + arr2[i]);
        }
    }
}
