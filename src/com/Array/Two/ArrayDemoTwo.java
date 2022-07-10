package com.Array.Two;

import java.util.Arrays;

public class ArrayDemoTwo {
    public static void main(String[] args) {
      int DemoTwo[][] = {
              {12, 89, 0, 34,9},
              {89, 33, 77, 78, 11}
      };
        //System.out.println("Two Dimensional data :=> " + Arrays.toString(DemoTwo));

        for(int i=0; i < DemoTwo.length; i++) {
           System.out.println("Two Dimensional data ["+ i + "]:=> " + Arrays.toString(DemoTwo[i]));
            for(int j=0; j < DemoTwo[i].length; j++){
                System.out.println("index of ["+i+"]["+j+"] :=> " + DemoTwo[i][j] );
            }
        }
    }
}
