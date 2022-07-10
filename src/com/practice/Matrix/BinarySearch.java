package com.practice.Matrix;

public class BinarySearch {
    public static void main(String[] args) {
        // should be sorting
        int [] a = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};
        int search = 16;
        int li = 0;
        int hi = a.length-1;
        int mi = (li+hi)/2;

        while(li <= hi) {
            if (a[mi] == search) {
                System.out.println("Item is at " + mi + " index position");
                break;
            } else if (a[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if(li > hi){
            System.out.println("Element not found!");
        }
    }
}


// User function Template for Java

//Input:
//        N = 5
//        arr[] = {1 2 3 4 5}
//        K = 4
//        Output: 3

//class Solution {
//    int binarysearch(int arr[], int n, int k) {
//        // code here
//
//        int li = 0;
//        int hi = n-1;
//
//        while(li <= hi){
//            int mid = (li + hi) / 2;
//            if(arr[mid] == k){
//                return mid;
//            }else if(arr[mid] > k){
//                hi = mid - 1;
//            }else{
//                li = mid+1;
//
//            }
//        }
//        return -1;
//    }
//}