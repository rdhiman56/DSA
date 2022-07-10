package com.competative.stack;


public class stackArrayImplimentation {
    // push, pop, peek, isEmpty
    int[] arr = new int[4];
    int top = -1;

    // push
    public void push(int data) {
        if((arr.length-top) > 1){ // 4 - (-1) = 5
            top++;
            arr[top] = data;
            System.out.println("Insertion Success : " + arr[top]);
        }else {
            System.out.println("Stack Over Flow");
        }
    }

    // pop
    public void pop() {
        if(top >= 0){
            System.out.println("Deleted : " + arr[top]);
            top--;
        }else {
            System.out.println("Stack Over Flow");
        }
    }


    // peek
    public int peek() {
        if(top > 0){
           return arr[top];
        }else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }


    // isEmpty
    public boolean isEmpty() {
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {

       // System.out.println(Arrays.toString(arr));
        stackArrayImplimentation obj = new stackArrayImplimentation();

        obj.push(2);
        obj.push(4);
        obj.push(48);
        obj.push(6);
        obj.push(10);


        obj.isEmpty();
        System.out.println("Is Empty : " + obj.isEmpty());

        obj.pop();
        System.out.println("top value : " + obj.peek());

        obj.pop();
        System.out.println("top value : " + obj.peek());

        obj.pop();
        obj.pop();
        obj.pop();
//        System.out.println("top value : " + obj.peek());



    }
}
