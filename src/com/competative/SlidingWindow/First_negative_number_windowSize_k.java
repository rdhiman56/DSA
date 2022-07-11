package com.competative.SlidingWindow;


import java.util.ArrayDeque;
import java.util.Queue;

public class First_negative_number_windowSize_k {

    static void getNegativeNumber_Approch1(int [] a, int k) {
        Queue<Integer> q = new ArrayDeque<>();

        for(int i=0; i<k; i++) {
            if(a[i] < 0) {
                q.add(a[i]);
            }
        }
        if(q.isEmpty()){
            System.out.println(0);
        }else {
            System.out.println(q.peek());
        }


        for(int j=k; j< a.length; j++){
            while(!q.isEmpty() && (a[j-k] == q.peek())){
                q.remove();
            }
            if(a[j] < 0){
                q.add(a[j]);
            }
            if(q.isEmpty()){
                System.out.println(0);
            }else {
                System.out.println(q.peek());
            }
        }
        //System.out.println(q+"");
    }

    // Approach 2: Brute Force
    // T.C = O(n*k) ~ O(n2)
    // S.C : O(1)
    static void getNegativeNumber_Approch2(int [] a, int k) {
        boolean flag;
        for(int i=0; i<=a.length-k; i++) {
            flag = false;
            for (int j = 0; j<k; j++) {
                if (a[i+j] < 0) {
                    System.out.println(a[i+j] + " ");
                    flag = true;
                   break;
                }
            }
            if(!flag){
                System.out.println("0");
            }

        }

    }

    public static void main(String[] args) {
        int []a = {12, -4, -1, 2, 8, -10, 37, 9};
        getNegativeNumber_Approch1(a, 3);
        //getNegativeNumber_Approch2(a, 3);
    }
}
