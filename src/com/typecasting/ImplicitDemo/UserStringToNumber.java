package com.typecasting.ImplicitDemo;

import java.util.Scanner;

public class UserStringToNumber {
    public static void main(String[] args) {
        System.out.println("Enter String Output");
        Scanner userInput = new Scanner(System.in);
        String object = userInput.nextLine();

        int numberConvertion = Integer.parseInt(object);
        System.out.println("Number conversion" + numberConvertion);
    }
}
