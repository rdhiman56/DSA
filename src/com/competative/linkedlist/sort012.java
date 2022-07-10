package com.competative.linkedlist;

public class sort012 {

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

    class Solution
    {
        //Function to sort a linked list of 0s, 1s and 2s.
        static Node segregate(Node head)
        {
            // add your code here

            int c0 = 0, c1 = 0, c2=0;

            Node curr = head;

            while (curr != null){
                if(curr.data == 0){
                    c0++;
                }else if(curr.data == 1){
                    c1++;
                }else if(curr.data == 2){
                    c2++;
                }
                curr = curr.next;
            }

            Node val = head;

            while (val != null){
                while(c0>0){
                    val.data = 0;
                    val = val.next;
                    c0--;
                }
                while(c1>0){
                    val.data = 1;
                    val = val.next;
                    c1--;
                }

                while(c2>0){
                    val.data = 2;
                    val = val.next;
                    c2--;
                }

            }
            return head;
        }
    }



}
