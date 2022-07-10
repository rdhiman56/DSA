package com.practice.Matrix;

public class SubtractMatrix {
    public static void main(String[] args) {
        int a[][] = {{5, 10, 15}, {20, 25,30}, {35, 40, 45}};
        int b[][] = {{1, 2, 3}, {4, 5, 6}, {2, 3, 5}};
        int c[][] = new int [3][3] ;

        int row = a.length;
        int col = b.length;

        System.out.println("First Matrix");
        for (int i=0; i < row; i++ ){
            for (int j=0; j< col; j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix");
        for (int i=0; i < row; i++ ){
            for (int j=0; j< col; j++){
                System.out.print(b[i][j] +" ");
            }
            System.out.println();
        }

        // Subraction Matix
        System.out.println("Resultant Matrix");
        for (int i=0; i < row; i++ ){
            for (int j=0; j< col; j++){
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }
    }
}
