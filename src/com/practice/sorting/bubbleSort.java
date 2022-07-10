package com.practice.sorting;

public class bubbleSort {
    public static void main(String[] args) {
       // int [] a = {36, 19,29, 12, 5};
        String [] a = {"rahul", "deepak", "shubham","monali", "aliya"};
        int flag = 0;
        for(int i=0; i < a.length; i++){ // for itration
            for(int j=0; j < a.length-1-i; j++){ // for compare -i becaz last number once sort not need to again to check
               // System.out.println("["+j+"] " + a[j]);
                if(a[j].compareTo(a[j+1]) > 0){
//                if(a[j] > a[j+1]){
                    String temp = a[j];
//                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for (int i =0; i<a.length; i++){
            System.out.println("["+i+"] " + a[i]);
        }
    }
}
