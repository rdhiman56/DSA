package com.practice.basic;

public class PrimeNumber {
    // Prime number : 1,2 , 3, 5, 7, 11, 13, 17, 19
    // Prime Number are those you divide by them self or by 1
    public static void main(String[] args) {

        int n = 7, temp = 0;
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                temp = temp + 1;
            }
        }

        if (temp > 0){
            System.out.println("Number is **Not** Prime Number Dear");
        }else{
            System.out.println("Number is Prime Number Dear");
        }




        // +++++Second Way+++++++++++
//        int n = 4;
//        boolean primeNumber = true;
//        for (int i=2; i < n; i++ ){
//            if(n%i == 0){
//                primeNumber = false;
//                break;
//            }
//        }
//        System.out.println("Prime Number :: "+ primeNumber);



    }
}
