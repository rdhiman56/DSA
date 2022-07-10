package com.competative.Queues;

public class CircularQueusUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        // constructor
        Queue(int nsize){
            arr = new int[nsize];
            this.size = nsize;
        }

        // is Empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // is Full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //add O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
            }
            if(front == -1){
                front =  0;
            }
            rear = (rear+1) %size;
            arr[rear]= data;
        }

        //Deque : int bcz with elemen remove it also return tha element O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            // Single element Condition:--
            if(rear == front){
                return rear = front = -1;
            }else {
                front = (front+1)%size;
            }

            return result;
        }

        // Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }


    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        //3 4 5 6 7
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
