package com.competative.linkedlist;

public class LinkedListEx {
    // 1. creat Node class
    // 2. To create linked create object of your class (LinkedListEx)
    // 3. Add First and Last -traverse assign head valuue to curr node
    // 4.
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // Add First and Last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //deleteFirst
    public void deleteFirst () {
        if(head == null){
            System.out.println("List is Empty!!");
            return;
        }
        head = head.next;
    }

    //delete Last
    public void deleteLast () {
        if(head == null){
            System.out.println("List is Empty!!");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

       Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;

    }

    //print
    public void printList(){
        if(head ==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " => ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListEx list = new LinkedListEx();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}
