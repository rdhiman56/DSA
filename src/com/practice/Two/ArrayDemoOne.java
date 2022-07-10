package com.practice.Two;

import java.util.Arrays;

public class ArrayDemoOne {

    public static void main(String[] args) {
        int onedem[] = {12, 67, 90, 22};
        System.out.println(Arrays.toString(onedem));

        for(int i=0; i < onedem.length; i++){
            System.out.println("Index Array data [" + i + "] :=> " +onedem[i]);
        }
    }

}
