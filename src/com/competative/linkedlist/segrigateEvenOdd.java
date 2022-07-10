package com.competative.linkedlist;

public class segrigateEvenOdd {
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


    class Solution{
        Node divide(int N, Node head){
            // code here

            if(head == null || head.next == null){
                return head;
            }

            Node even = new Node(-1);
            Node ep = even;

            Node odd = new Node(-1);
            Node op = odd;

            Node curr = head;

            while(curr != null){
                if(curr.data % 2 == 0){
                    ep.next = curr;
                    ep = curr;
                    curr = curr.next;
                }else {
                    op.next = curr;
                    op = curr;
                    curr = curr.next;
                }
            }

            ep.next = odd.next;
            op.next = null;
            return even.next;
        }
    }
}
