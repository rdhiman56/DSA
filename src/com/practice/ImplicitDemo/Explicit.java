package com.practice.ImplicitDemo;

public class Explicit {
    public static void main(String[] args) {

        double doublecount = 100.667788776554;
        float floatcount = (float) doublecount;
        long longcount = (long) doublecount;

        System.out.println("doublecount :" + doublecount);
        System.out.println("floatcount :" + floatcount);
        System.out.println("longcount :"+ longcount);
    }
}
