package com.typecasting.ImplicitDemo;

public class StringToNumber {
    public static void main(String args[]) {
        String x = "221";
        String y = "5667";

        int xconvert = Integer.parseInt(x);
        double ydouble = Double.parseDouble(y);

        System.out.println(xconvert + ydouble);
    }
}
