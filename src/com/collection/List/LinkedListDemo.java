package com.collection.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Shivam");
        linkedlist.add("karan");
        linkedlist.add("Anjali");
        linkedlist.add("Poonam");
        linkedlist.add("kangana");

        System.out.println("linkelist:=> "+ linkedlist);


        //forloop
        for(int i=0; i<linkedlist.size(); i++) {
            System.out.println("Linked list [" + i+ "]"+ linkedlist.get(i));
        }

        // itrator
        Iterator<String> linkedlistnew = linkedlist.iterator();
        while (linkedlistnew.hasNext()){
            System.out.println("itrartion:=> "+ linkedlistnew.next());
        }
    }
}
