package com.practice.OOPSConcept;

class Student {
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Parametrize constructor
    Student(int age, String name){
        this.name =name;
        this.age = age;
    }

}

public class OOPS {
    public static void main(String[] args){
        Student st1 = new Student(34, "Rahul");
        st1.studentInfo();
    }
}



// ooppa car

//class Car {
//    String color;
//    String type;
//
//    public void drive(){
//        System.out.println("Driving!!!!!!!");
//    }
//
//    public void printType(){
//        System.out.println(this.color);
//        System.out.println(this.type);
//    }
//}
//
//
//public class OOPS {
//    public static void main(String args[]){
//        Car car1 = new Car();
//        car1.color = "Red";
//        car1.type = "mini";
//                    // Car() - constructor
//        Car car2 = new Car();
//        car2.color ="yellow";
//        car2.type = "TT";
//
//        car1.printType();
//        car2.printType();
//
//    }
//}




























