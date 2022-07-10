package com.practice.collection.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rahul", 2345, "Manager");
        Employee emp2 = new Employee(2, "Payal", 2345, "Screemer");
        Employee emp3 = new Employee(3, "Azama", 2345, "Little");
        Employee emp4 = new Employee(4, "Anjali", 2345, "Kacha Badaam");

        Set<Employee> empDataSet = new HashSet<Employee>();

        empDataSet.add(emp1);
        empDataSet.add(emp2);
        empDataSet.add(emp3);
        empDataSet.add(emp4);

        System.out.println(empDataSet);

        for (Employee emp : empDataSet ){
            System.out.println("Employee Data Set :=> "+ emp.dname);
        }
    }
}
