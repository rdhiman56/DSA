package com.practiceJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String //carAt
        // replace //subString

        String name = "Rahul";
        //System.out.println(name.charAt(4));
        //String name2 = name.replace('h', 'S');

        // SubString => strings are immutable
        String sString = "Rahul loves JAVA";
        System.out.println(sString.substring(5, 10)); // 4 is excluded

        //Array => array is non-primitive so we use new

        // Sorting
//        int [] marks = new int[2];
//        marks[0] = 34;
//        marks[1] = 21;
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

        //Alreat know store things we cant use new => 2 dimentials array
        int[][] finalmarks = {{7, 13, 6}, {71, 94, 34}};
        System.out.println(finalmarks[0][1]);

        // Casting => convert one type to another type (implicite and explicite) - bucket and class example
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        // Explicit casting:- (by using () we allow java to use int thoda bht jyada bhi ho data we can use it , )
        int p =180;
        int fp = p + (int)18.0;
        System.out.println(fp);

        //Random call
        System.out.println((int)(Math.random()*100));

        // How to take input ?
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Your age:");
//        int age = sc.nextInt();
//        System.out.println(age);

        //string input
//        Scanner scname= new Scanner(System.in);
//        System.out.println("Input your name:");
//        String strname = scname.nextLine();
//        System.out.println(strname);

        // Comparision operators:- == != >= <=
        // Conditional Statement if else
        // logical operators && || !
        // switch


        //loops
//        Scanner sc = new Scanner(System.in);
//        int number = 0;
//        do {
//            System.out.println("Enter the number");
//            number = sc.nextInt();
//            System.out.println(number);
//        }
//        while(number > 0) ;
//            System.out.println("the end");

        //break continue

        // exceptions
        // Methods Functions






    }
}
