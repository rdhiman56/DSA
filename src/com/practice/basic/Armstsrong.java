package com.practice.basic;

import java.util.Scanner;

public class Armstsrong {
    //Armstsrong : 1(3) + 5(3) + 3(3) = 153

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Armstring Value ::");
        int userinput = sc.nextInt();
        int num = userinput;
        int length = 0;
        int remainder = 0;
        double arm = 0 ;

        while (num > 0){
            num = num / 10;
            length++;
        }
        System.out.println("ln :: "+ length);

        num = userinput;

        while (num > 0 ){
            remainder = num % 10;
            arm = arm + Math.pow(remainder, length);
            num = num / 10;
        }

        if(arm == userinput){
            System.out.println("ArmStrong Number");
        }else {
            System.out.println("Not a ArmString!!");
        }

    }
}
