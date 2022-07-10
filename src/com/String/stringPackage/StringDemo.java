package com.String.stringPackage;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello Dear";
        String str2 = "Hello Dear";

        String str3 = new String("Hello Dear Friends");
        String str4 = new String("Hello Dear Friends");

        String str5 = new String("Hello Dear Dost");
        String str6 = new String("Hello Dear Mitro");

        System.out.println("concat:=> "+ str1.concat(" "+ str2));

        str1.concat(str2);
        System.out.println("sout:=> "+  str1);



        // == operator
        System.out.println("\n == Opeartor results:");
        if(str1 == str2){
            System.out.println("same String :=> "+ (str1==str2));
        }else {
            System.out.println("Diffrent value :=> "+ (str1==str2));
        }

        if(str3 == str4){
            System.out.println("same String :=> "+ (str3==str4));
        }else {
            System.out.println(" Diffrent value :=> "+ (str3==str4));
        }

        // .equals()
        System.out.println("\n .equals() Results");
        Boolean result1 = str1.equals(str2);
        System.out.println("same data :=> "+ result1);

        Boolean res2 = str5.equals(str6);
        System.out.println("Diffrent data :=> " + res2);

        // compare()
        System.out.println("\n .compare() Results");
        int result = str1.compareTo(str2);
        System.out.println("Compare data :=> "+result);

        int result2 = str5.compareTo(str6);
        System.out.println("Compare data result :=> "+ result2);

    }

}
