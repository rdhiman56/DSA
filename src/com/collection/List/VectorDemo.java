package com.collection.List;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<String> vec1 = new Vector<String>();
        vec1.add("Rahul");
        vec1.add("Dhiman");
        vec1.add("Lokesh");
        vec1.add("Munaaa");
        System.out.println("Vector value1 :=> " + vec1);

        vec1.remove("Lokesh");
        System.out.println("Vector value2"+ vec1);

        vec1.set(1, "Saisha");
        System.out.println("Replcae Data :=> "+ vec1);

        System.out.println("index value:=> "+ vec1.get(1));

        // For loop
        for(int i=0; i< vec1.size(); i++){
            System.out.println("data["+i+"]:=> " + vec1.get(i));
        }

        // itrator
        Iterator<String> vec2 = vec1.iterator();
        while (vec2.hasNext()){
            System.out.println("value:=> "+ vec2.next());
        }

        // Enhance loop
        for(String vec : vec1){
            System.out.println("value enhancement:=> " + vec);
        }
    }
}
