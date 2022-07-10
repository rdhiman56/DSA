package com.practice.accessmodifier;

class Vehicle{
    private String name = "BMW";
    private int model =  2022;
    private String fuleType = "Petrol";

    public void ram(){
        System.out.println(name+model) ;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
}

public class PrivateAccess {
    public static void main(String[] args) {
        Vehicle ObjName = new Vehicle();
        ObjName.ram();
    }
}