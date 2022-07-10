package com.practice.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        // Array intialize
        int arr1[] = new int[] {1, 6, 9, 56, 89,45}; // intial array
        int arr2[] = new int[arr1.length]; //Create another array arr2 with size of arr1

        //Copying all elements of one array into another
        for(int i =0; i< arr1.length; i++){
            arr2[i] = arr1[i];
        }

        //Displaying elements of array arr1
        System.out.println("Elements of new array: ");
        for(int i =0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }

        System.out.println();

        //Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for(int i =0 ; i < arr2.length ; i++){
            System.out.println( arr2[i]);
        }




    }
}
