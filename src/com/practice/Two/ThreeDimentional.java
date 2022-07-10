package com.practice.Two;

import java.util.Arrays;

public class ThreeDimentional {
    public static void main(String[] args) {
        int newval[][][] = {
                {
                    {12, 45, 2}, {56,78,34}
                },
                {
                    {89, 90, 61}, {34,78,90}
                },
                {
                    {69, 11, 54}, {43,93,45}
                }
            };

        // Table
        for(int table=0; table < newval.length; table++){
            for(int row=0; row < newval[table].length; row++){
               System.out.println("\n Table "+ table + ":=>" + Arrays.toString(newval[table][row]));
                for (int col=0; col < newval[table][row].length; col++){
                    System.out.println("Index:: [" + table + "][" + row + "][" + col + "] ==> " + newval[table][row][col]);
                }
            }
        }
    }
}
