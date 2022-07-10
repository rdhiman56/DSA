package com.competative.linkedlist;

public class linkedlist1 {
    Node head;
    class Node {
        int data;
        Node next;

        public Node (int d){
            this.data = d;
            next = null;
        }
    }

    public void printList(){
        Node n = head;
        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }


    public void main(String[] args) {
        linkedlist1 listl = new linkedlist1();

        listl.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        listl.head.next = second;
        second.next = third;
        listl.printList();
    }

    public static class InsertLinkedList {

        Node head; // head of list

        // linked list node
        class Node {
            int data;
            Node next;

            public Node(int d) {
                this.data = d;
                this.next = null;
            }
        }

        // insert new node at front
        public void push(int new_data) {
            Node new_node = new Node(new_data); // allocate and put data
            new_node.next = head; // make next of new node as head
            head = new_node; // move heade point to new node
        }

    //    public void insertAfter(Node prev_node, )

        public void PrintData(){
            Node tnode = head;
            while (tnode != null){
                System.out.println(tnode.data);
                tnode = tnode.next;
            }
        }
        public static void main(String[] args) {
            InsertLinkedList obj = new InsertLinkedList();
            obj.push(1);
    //        System.out.println("Created Linked List is:::");
            obj.PrintData();
        }
    }
}
