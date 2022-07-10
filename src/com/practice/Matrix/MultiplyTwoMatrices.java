package com.practice.Matrix;

public class MultiplyTwoMatrices {
    public static void main(String[] args) {
//        int a[][] = new int[3][3];
//        int b[][] = new int[3][3];
//        int c[][] = new int[3][3];

//        Scanner sc = new Scanner(System.in);

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int c[][] = new int[3][3];

//        System.out.println("Enter number in First Matrix.....");
//        for (int i=0; i<3; i++){
//            for (int j=0; j<3; j++){
//                System.out.println("a["+i+"]["+j+"]");
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter number in Second Matrix.....");
//        for (int i=0; i<3; i++){
//            for (int j=0; j<3; j++){
//                System.out.println("b["+i+"]["+j+"]");
//                b[i][j] = sc.nextInt();
//            }
//        }

        System.out.println("First Matrix.....");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix.....");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        //Multiplication of matrix

//        int row1 = a.length;
//        System.out.println("ro1 ; "+row1);
//        int col1 = a[0].length;
//        System.out.println("ro1 ; "+col1);
//        int row2= b.length;
//        System.out.println("ro1 ; "+row2);
//        int col2 = b[0].length;
//        System.out.println("ro1 ; "+col2);

        for(int i=0;i<a.length;i++){
            for(int j=0; j< b[0].length;j++){
                c[i][j] =0;
                for (int k=0; k< b.length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result Matrix.....");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }



    }
}
