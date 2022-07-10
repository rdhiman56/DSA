package com.competative.linkedlist;

public class identicalLL {

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

    class Solution {

        //Function to check whether two linked lists are identical or not.
        public boolean isIdentical (Node head1, Node head2){
            //write your code here

            if (head1 == null && head2 == null){
                return true;
            }

            Node ptr1 = head1;
            Node ptr2 = head2;

            while(ptr1 != null && ptr2 != null){
                if(ptr1.data != ptr2.data){
                    return false;
                }
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;

            }

            return ( ptr1 == null && ptr2 == null);
        }
    }
}
