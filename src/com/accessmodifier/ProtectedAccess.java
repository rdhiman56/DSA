package com.accessmodifier;

//class body {
//    protected String head = "Head";
//    protected int fingures = 10;
//}

public class ProtectedAccess extends body {
    public static void main(String[] args) {
        body obj = new body();
        System.out.println("head---"+ obj.fingures);
    }
}
