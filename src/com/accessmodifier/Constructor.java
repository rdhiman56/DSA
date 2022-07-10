package com.accessmodifier;

class ConstructorCall {
    // declare variables
    int i;
     double d;

    // default , Parametrized  constructor

    ConstructorCall(){
        System.out.println("Default");
    }

    ConstructorCall(double d) {
        this.d = d;
        System.out.println("Parametrized Print+++" + d);
    }

    ConstructorCall(int i, double uy) {
        this.i = i ;
        this.d = uy;
    }

}

public class Constructor {
    public static void main(String[] args) {
        ConstructorCall Object = new ConstructorCall();
        ConstructorCall Object2 = new ConstructorCall(7.00);
        ConstructorCall Object3 = new ConstructorCall(6, 9.00);

        System.out.println(Object3.d);
    }
}