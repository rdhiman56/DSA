package com.competative.linkedlist;

public class removeLoop {

class Node
{
    int data;
    Node next;
}


    class Solution
    {
        //Function to remove a loop in the linked list.
        public static void removeLoop(Node head){
            // code here
            // remove the loop without losing any nodes
            if(head == null || head.next == null){
                return;
            }
            Node slow = head;
            Node fast = head;

            while(fast.next != null && fast.next.next != null){

                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    break;
                }
            }

            if(slow != fast){
                return;
            }

            Node temp = head;
            // corner case, when loop starts from the head node
            if(slow == temp){
                while (temp.next != slow){
                    temp = temp.next;
                }
                temp.next = null;
            }
            else {
                // Node temp = head;
                while (slow.next != temp.next){
                    slow = slow.next;
                    temp = temp.next;
                }
                slow.next = null;
            }

        }
    }
}
