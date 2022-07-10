package com.sorting;

import java.util.Arrays;

public class mergeSort {

    public static void divide(int arr[], int start, int end){
        // breaking point
        if(start >= end){
            return;
        }

        int len = (end - start) + 1; // lenght
        int mid = start + (end - start)/2; // mid = start + end / 2;

        divide(arr, start, mid);
        divide(arr, mid+1, end);
        mergeConqore(arr, start, mid, end);
    }

    public static void mergeConqore(int arr[], int start, int mid, int end ){
        int merge[] = new int[end - start + 1]; // length
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] <= arr[idx2]){
                merge[x] = arr[idx1];
                x++; idx1++;
            }else {
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid){
            merge[x] = arr[idx1];
            x++; idx1++;
        }
        while (idx2 <= end){
            merge[x] = arr[idx2];
            x++; idx2++;
        }

        // original array
        for(int i=0, j=start; i<merge.length; i++, j++){
            arr[j] = merge[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {23, 56, 87, 12, 5, 90, 45};
        System.out.println("Before Sorting Array::" + Arrays.toString(arr));

        divide(arr, 0, arr.length-1);
        System.out.println("After Sorting Array::" + Arrays.toString(arr));
    }
}
