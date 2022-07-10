package com.practice.OOPSConcept;

// polymorphism : poly - many, morphism : forms
/// two types :- func overloading and func overriding
// complie time and run time polymorphism  (run time use during inheritance)
// Funciton overloading : same naam k many funcitons ko ek hi class mai create krna is funciton overloading
// [1. overloading mai koi na koi diffrentialing factor hona chaiye , 2. might be diffrnt return type exmple void or args diffrnet hone chahiye string or int  ]
// here complie time error comes if comes


class Students {
    String name;
    int age;
    // using same function for diffrent diffrnet purpose
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " "+ age);
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        Students myinfo = new Students();
        myinfo.name = "rahul";
        myinfo.age = 34;
        myinfo.printInfo(myinfo.name, myinfo.age);
    }
}