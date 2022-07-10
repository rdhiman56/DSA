package com.practice.Matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int a[][] = new int [2][2];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2D arrya");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                a[i][j] = obj.nextInt();;

            }
        }
        System.out.println("2D array ::");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.println(a[i][j]);

            }
        }
    }
}
