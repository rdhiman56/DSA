package com.competative.linkedlist;

public class lengthOfLinkedList {

class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

    class Solution
    {
        //Function to count nodes of a linked list.
        public static int getCount(Node head)
        {

            //Code here
            Node temp = head;
            int len = 0;
            if(head == null){
                return 0;
            }

            while (temp.next != null){
                temp = temp.next;
                len++;
            }
            int newlen = len + 1;
            return newlen;
        }
    }

}
