package com.competative.Queues;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data){
            data = this.data;
            next = null;
        }
    }


    static class Queue {
        static Node head = null;
        static Node tail = null;

        // is Empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //add O(1)
        public static void add(int data){
           Node newNode =  new Node(data);
           // If only 1 element in ll
            if(tail == null){
                tail = head = newNode;
                return;
            }

           tail.next = newNode;
           tail = newNode;

        }

        //Deque : int bcz with elemen remove it also return tha element O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;

            return front;
        }

        // Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }


    }


    public static void main(String[] args) {
        CircularQueusUsingArray.Queue q = new CircularQueusUsingArray.Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
