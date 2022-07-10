package com.Array.Two;

import java.util.Arrays;

public class OneDimensional {
    public static void main(String[] args) {
        int arrData[] =  {45, 6, 90,40, 45,12};

        for(int i=0; i < arrData.length; i++){
            if(arrData[i] == 90){
                arrData[i] = 69;
                System.out.println(arrData[i]);
                System.out.println(Arrays.toString(arrData));
                break;
            }
        }
    }
}
