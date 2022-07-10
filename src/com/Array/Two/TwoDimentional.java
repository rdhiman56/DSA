package com.Array.Two;

import java.util.Arrays;

public class TwoDimentional {
    public static void main(String[] args) {
        int num[][] = {
                {23, 56, 78},
                {36, 89, 12}
        };

        //System.out.println(Arrays.toString(num));
        for(int i=0; i < num.length; i++){
            System.out.println("\nBlock " + i+" => " +Arrays.toString(num[i]));
            for(int j=0; j < num[i].length; j++){
                System.out.println("Item[" + i + "][" + j+"] :=> " +num[i][j]);
            }
        }
    }
}
