package com.practice.collection.List;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        //List<String> vector1 = new Vector<String>();
        //List<String> linkedlist1 = new LinkedList<String>();
        //List<String> stack1 = new Stack<String>();

        //add data to array list
        list1.add("rahul");
        list1.add("dhiman");
        list1.add("rahul");
        list1.add("shivam");
        list1.add("anjali");

        System.out.println(list1);
        System.out.println(list1.get(3));
        System.out.println(list1.remove(1));
        System.out.println(list1.set(1, "saby"));
        System.out.println(list1);


        // ]Iteration Over List
        //1.Iteration by itrator
            Iterator<String> itra1 = list1.iterator();
            while (itra1.hasNext()) {
                System.out.println("Values:=> " + itra1.next());
            }
            //Forloop with counter
        for(int i=0; i < list1.size(); i++){
            System.out.println("counter value:=> "+ list1.get(i));
        }

        //enhance for loop
        for(String name : list1){
            System.out.println("name of list:=> "+name);
        }


    }
}
