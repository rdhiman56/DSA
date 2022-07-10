package com.practice.accessmodifier;

class getAllPrivateData{
    private String test1 = "Rahul eat protine";
    private int test2 = 69;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }
}

public class PrivateDemo2 {
    public static void main(String[] args) {
        getAllPrivateData obj = new getAllPrivateData();
        System.out.println(obj.getTest1());
        System.out.println(obj.getTest2());

        obj.setTest1("Helloo");
        System.out.println(obj.getTest1());

        obj.setTest2(45);
        System.out.println(obj.getTest2());
    }
}
