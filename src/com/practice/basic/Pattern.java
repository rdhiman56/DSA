package com.practice.basic;

public class Pattern {
    public static void main(String[] args) {
        /*
          //i =1 , j =1 ,, i=2, j=1, 2 ,, i=3, j=1,2,3
        1. START PATTREN :: 1
        int n = 5;
        // Row column concept
        for(int i = 0; i <= 5; i++){
            for (int j =0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         */

        //  START PATTREN :: 2
        /*
        for (int i=1; i <= 4; i++){
            for(int j=4; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
         */

        // START PATTREN :: 3 = 1+2 combination
    /*
        for (int i=1; i <=4; i++){
            //System.out.println("*");
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i <=4; i++){
            //System.out.println("*");
            for (int j=4; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
 */
        // START PATTREN :: 4 = mirror star
       /* int n =4;
        for (int i=1; i <= n; i++){
            for(int j= n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        */
        // START PATTREN :: 5 = reverse mirror star
    /*
        for(int i=0; i<=4; i++){
           for(int j=0; j<=i; j++){
               System.out.print(" ");
           }
           for(int k=4; k>=i; k--){
               System.out.print("*");
           }
            System.out.println();
        }
*/
        // START PATTREN :: 6 = reverse mirror star

        for(int i=1; i<=4; i++){
            for (int l=3; l >= i; l--){
                System.out.print(" ");
            }
            for(int m=1; m<=i; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1; i <= 4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=4; k>= i; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
        }
}
