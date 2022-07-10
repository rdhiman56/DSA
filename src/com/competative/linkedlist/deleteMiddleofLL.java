package com.competative.linkedlist;

public class deleteMiddleofLL {

class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

    class Solution {
        Node deleteMid(Node head) {
            // This is method only submission.
            // You only need to complete the method.

            if(head == null){
                return head;
            }

            if(head.next == null){
                return head;
            }

            Node slow = head;
            Node fast = head;
            // Find the middle and previous of middle.
            Node prev = null;
            // To store previous of slow_ptr
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                prev = slow;
                slow = slow.next;
            }
            // Delete the middle node
            prev.next = slow.next;

            return head;
        }
    }
}
