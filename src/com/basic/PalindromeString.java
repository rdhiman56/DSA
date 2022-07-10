package com.basic;

import java.util.Scanner;

public class PalindromeString {
    // Palindrome :- abcddcba :: from reverse side alsoo it should same

    // 1. Palindrome with input - For loop
   /*

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String to Check Palindrome :: ");
        String userInput = scan.nextLine();
        String reverse = "";

        for (int i = userInput.length() -1; i >= 0 ; i--){
            reverse += userInput.charAt(i);
        }
        if(reverse.equalsIgnoreCase(userInput)){
            System.out.println("Its a Palendrome Shit man!!");
        }else{
            System.out.println("Its Normal String !!");
        }
    }

    */

    // 2. Palindrome with input - While Loop
    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String Value ::");
        String str = scan.nextLine();
        int i = 0;
        int j = str.length() -1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a Palendroime!!");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Its a Palendrome!!");
    }
*/

    // 3. Palindrome with Static String - while loop
  /*
    public static void main(String[] args) {
        String x = "abcddcba";
        int i = 0;
        int j = x.length() -1;

        while(i<j){
            if(x.charAt(i) != x.charAt(j)){
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Its a Palindrome");
    }
*/

    // 2. Palindrome with Number's

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :: ");
        int input = sc.nextInt();
        int tempVal = input;
        int remainder, reverse = 0;

        while(tempVal > 0){
            remainder = tempVal % 10;
            tempVal = tempVal / 10;
            reverse = reverse * 10 + remainder;
        }

        if(reverse == input){
            System.out.println("This is Plaendrome!!!");
        }else {
            System.out.println("Normal Value");
        }

    }
}
