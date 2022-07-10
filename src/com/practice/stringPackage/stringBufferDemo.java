package com.practice.stringPackage;

public class stringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Hello Dear");
        str.replace(1, 1, "t");
        System.out.println(str);
        str.insert(0, "abd");
        System.out.println(str);
        str.delete(0,3);
        System.out.println(str);
        System.out.println(str.reverse());

        // conversion of string to striingbuffer
        String str1 = "Hello";
        System.out.println(str1);
        StringBuffer strrr = new StringBuffer(str1);
        System.out.println(strrr);
        System.out.println(strrr.reverse());

        // conversion of string to stringbuilder
        String str2 = "Hello";
        System.out.println(str2);
        StringBuilder stri= new StringBuilder(str1);
        System.out.println(stri);
        System.out.println(stri.reverse());
    }
}
