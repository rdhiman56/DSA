package com.basic;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Petrson number::");
        int num = sc.nextInt();

        if(isPeterson(num)){
            System.out.println("Peterson Number");
        }else{
            System.out.println("Not a Petrson number");
        }
    }

    static boolean isPeterson(int num){
        int temp = num;
        int sum = 0;
        while (temp > 0){
            int digit = temp % 10;
            sum = sum + fact(digit);
            temp = temp / 10;
        }
        return (sum == num);
    }

    static int fact(int num){
            if(num == 1){
                return 1;
            }else {
                int z;
                z = num * fact(num - 1);
                return(z);
            }
    }
}
