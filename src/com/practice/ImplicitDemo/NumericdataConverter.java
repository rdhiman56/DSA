package com.practice.ImplicitDemo;
import java.util.Scanner;

public class NumericdataConverter {
    public static void main(String[] args) {
        System.out.println("Enter User Data");

        Scanner input = new Scanner(System.in);
        int userInputData = input.nextInt();
        double doubleuserInput = (double) userInputData;

        System.out.println("double number ::: " + doubleuserInput);
    }
}
