package com.practice.basic;

public class ArrayOccurance {
    public static void main(String[] args) {
      int [] arr = {1, 23, 56, 23, 34, 1, 34, 23};
      int [] fr = new int [arr.length];
      int visited = -1;

      for(int i=0; i < arr.length; i++){
          int count = 1;
          for (int j= i+1; j < arr.length; j++){
              if(arr[i] == arr[j]){
                  count++;
                  fr[j] = visited; // -1
              }
              if(fr[i] != visited){
                  fr[i] = count;
              }
          }
      }
        for (int k=0; k < fr.length ;k++){
            if(fr[k] != visited){
                System.out.println("FR ["+arr[k]+"]::> "+ fr[k]);
            }
        }
    }
}
