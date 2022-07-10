package com.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class testAllSet {

    public static void main(String[] args) {

        //HashSet  :- uses hashcode of the object store values
        Set<Integer> set_val = new HashSet<Integer>();
        set_val.add(23);
        set_val.add(3);
        set_val.add(123);
        set_val.add(256);
        set_val.add(123);
        System.out.println("Set Values"+ set_val);


        // LinkedHashSet : It stores unique values with insertion order.
        Set<String> set_linkedhashset = new LinkedHashSet<String>();
        set_linkedhashset.add("shital");
        set_linkedhashset.add("Dhawan");
        set_linkedhashset.add("aman");
        set_linkedhashset.add("shital");
        set_linkedhashset.add("katrina");
        System.out.println("Add linkedhashset:=> "+ set_linkedhashset);

        // TreeSet : It stores unique values with ascending ordered data collection (Sorted Set)
        Set<String> set_treeSet = new TreeSet<String>();
        set_treeSet.add("X");
        set_treeSet.add("Z");
        set_treeSet.add("u");
        set_treeSet.add("t");
        System.out.println("Treeset=> "+ set_treeSet);

    }
}
