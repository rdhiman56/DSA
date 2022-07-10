package com.practice.Matrix;

public class LinearSearch {
    // intiger
//    public static void main(String[] args) {
//        int [] num = {23, 45, 12, 1, 78};
//        int item = 1;
//        int temp = 0;
//
//        for(int i=0; i < num.length; i++){
//            if(num[i] == item){
//                System.out.println("item is present @ this index "+i+"");
//                temp = temp+ 1;
//            }
//        }
//        if(temp == 0){
//            System.out.println("Item not Sound!");
//        }
//    }

    // String

    public static void main(String[] args) {
        String[] str = {"ram", "deepak", "shalu", "sita"};
        String search = "deepak";
        int temp = 0;

        for (int i=0; i< str.length; i++){
            if(str[i].equals(search)){
                System.out.println("item is present @ this index "+i+"");
                temp = temp + 1;
            }
        }
        if(temp == 0){
            System.out.println("item is not Present");
        }
    }

}
