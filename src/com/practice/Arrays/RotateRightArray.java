package com.practice.Arrays;

import java.util.Arrays;

public class RotateRightArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int last = arr[arr.length-1]; //last elemnt

        for (int i= arr.length-2; i >= 0; i--){
            arr[i+1] = arr[i];
        }
            arr[0] = last;


        System.out.println(Arrays.toString(arr));
    }
}
