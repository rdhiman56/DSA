package com.practice.accessmodifier;


class Bank {
    private int accountNo = 69696969;
    private double accountPin = 909099999990900000000000000D;

    public String bankName = "Demo Bank";
    public String bankAssets = "Chairs, bench";

    protected String bakVision = "Be Happy and get Happy Ending!!";

    int customerCount =  205;
    int custimerNumbers = 102;

    // Access modifier used to get result
    public void AccountNo_Pin() {
        System.out.println("Account No" + accountNo);
        System.out.println("Account Pin" +accountPin);
    }
}

public class BankLocker extends Bank{
    // TODO :: WAP for all access modifier
    // private -> accountNo , accountPin
    // public -> bankName, bankAssets
    // protected -> bankVision
    // default ->  customerCount ,customerNos.
    // add methods to access properties.

    public static void main(String[] args) {
        Bank BNKInfo = new Bank();
        BNKInfo.AccountNo_Pin();
        System.out.println("pubicAccessData ==>  "+ BNKInfo.bankName  + BNKInfo.bankAssets);
        System.out.println("protected data ==>  "+ BNKInfo.bakVision);
    }

}
