package com.typecasting.ImplicitDemo;

public class Implicit {
    // Type Casting :-  process of converting data from one type to another type.

    /**
     *  Widening Type Casting :- Converts data from lower range to higher range value
     *  byte -> short -> int -> long -> float -> double.
     *
     */

    public static void main(String[] args) {
        byte bytenumber = 100;
        int intnumber = bytenumber;
        long longnumber = intnumber;
        double doublenumber = longnumber;

        System.out.println("vyte number" +bytenumber);
        System.out.println("int number" +intnumber);
        System.out.println("long number" +longnumber);
        System.out.println("double number" +doublenumber);
    }
}
