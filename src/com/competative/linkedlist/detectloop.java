package com.competative.linkedlist;

public class detectloop {

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    class Solution {
        //Function to check if the linked list has a loop.
        public static boolean detectLoop(Node head){
            // Add code here
            if(head == null || head.next == null){
                return false;
            }

            Node slow = head;
            Node fast = slow;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
    }
}
