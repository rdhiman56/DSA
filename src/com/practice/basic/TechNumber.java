package com.practice.basic;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ::");
        int userinput = sc.nextInt();
        int num = userinput;
        int length = 0;

        while (userinput > 0){
            userinput = userinput / 10;
            length++;
        }

        if( length % 2 == 0 ) {
            int digit = length / 2;
            int first = num / (int) Math.pow(10, digit); // 20 ::=> 20.25 2025/100 = 20.25
            //System.out.println("First "+ num / (int) Math.pow(10, digit));
            int second = num % (int) Math.pow(10, digit);

            System.out.println("first" +first);

            System.out.println("second" +second);

            int sum = first + second;
            System.out.println("sum" +sum);

            sum = sum * sum ;

            if(sum == num){
                System.out.println(" Tech number");
            }else
            {
                System.out.println("not a tech no.");
            }
        }
    }


}
