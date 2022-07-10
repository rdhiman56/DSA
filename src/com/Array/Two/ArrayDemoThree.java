package com.Array.Two;

import java.util.Arrays;

public class ArrayDemoThree {
    public static void main(String[] args) {
        int demothree[][][] = {
                {
                        {12, 45, 90},
                        {45, 88, 99}
                },
                {
                        {44, 90, 67},
                        {66, 34, 11}
                }
        };


        for (int i=0; i< demothree.length; i++){
            //System.out.println("Row Block ["+i+"]" + Arrays.toString(demothree[i]));
            for (int j=0; j < demothree[i].length; j++){
                System.out.println("\n3D block [" + i + "][" + j + "]:=> "+ Arrays.toString(demothree[i][j]));
                for (int k=0; k < demothree[i][j].length; k++){
                    System.out.println("3D [" + i + "][" + j + "][" + k + "]:=>"+ demothree[i][j][k]);
                }
            }
        }
    }
}
