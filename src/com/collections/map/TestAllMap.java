package com.collections.map;

import java.util.*;

public class TestAllMap {
    public static void main(String[] args) {

        Map<String, String> phonebook = new HashMap<String, String>();

        phonebook.put("John", "3456788765");
        phonebook.put("Rahul", "8956788765");
        phonebook.put("saby", "0006788765");
        phonebook.put("Shiwani", "6756788765");

        System.out.println("\n-----------------------");
        System.out.println(phonebook);

        System.out.println(phonebook.get("Rahul"));

        //Iteration over map
        //1. Fetch all keys
        Set<String> allkeys =phonebook.keySet();
        //System.out.println("AllKeys value :=>" + allkeys);

        //2. use key to get all keys
        for(String keys: allkeys){
            System.out.println(keys + ":=> " + phonebook.get(keys));
        }

        //HashTable

        Map<String, Double> listOfItems = new Hashtable<String, Double>();

        listOfItems.put("Apple", 44.5);
        listOfItems.put("Mango", 344.5);
        listOfItems.put("Onion", 484.5);
        listOfItems.put("Grapse", 414.5);

        System.out.println("\n-----------------");
        System.out.println(listOfItems);

        Set<String> hashkeys = listOfItems.keySet();

        for(String key : hashkeys){
            System.out.println(key + ":=> " +listOfItems.get(key));
        }

        // TreeMap
        Map<Integer, String> listOfEmployee = new TreeMap<Integer, String>();

        listOfEmployee.put(1, "Rahul");
        listOfEmployee.put(2, "Saby");
        listOfEmployee.put(3, "Shiwani");
        listOfEmployee.put(4, "Shivam");

        System.out.println("\n-----------------------");
        System.out.println(listOfEmployee);

        Set<Integer> Treekey = listOfEmployee.keySet();

        for(Integer key2 : Treekey){
            System.out.println(key2 + " :=> " + listOfEmployee.get(key2));
        }





    }
}
