package com.practice.basic;

public class Factorial {
    //factorial

    /*
    public static void main(String[] args) {
        int fac = 1;
        for(int i=1; i <= 5 ; i++){
            fac = fac * i;
            System.out.println("Factorial ["+i+"]" + fac);
        }
    }
    */

    /*2. Recursive Method:- */
    // Recursive Method ::=>
    static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return (n * factorial(n-1));  // factorial = n * factorial(n-1)
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial::=> " + factorial(5));
//        int number = 4;
//        int fact = factorial(number);
//        System.out.println("Factorial::=> " + fact);
    }
}
