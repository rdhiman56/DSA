package com.competative.linkedlist;

public class cloneLL {
class Node {
    int data;
    Node next, arb;

    Node(int d)
    {
        data = d;
        next = arb = null;

    }
}

    class Clone {
        //Function to clone a linked list with next and random pointer.
        Node copyList(Node head)   {
            //Write your code here

            if(head == null || head.next == null){
                return null;
            }

            Node curr = head;

            // Step 1 : Create Copy Node
            while (curr != null){
                Node forw = curr.next;
                Node copy = new Node(curr.data);
                curr.next = copy;
                copy.next = forw;
                curr = curr.next.next;
            }

            // Step 2 : attach random pointers in copy Nodes
            curr = head;
            while(curr != null){
                curr.next.arb = (curr.arb != null) ? curr.arb.next : null;
                curr = curr.next.next;
            }

            // Step 3:- Segrigate original and clone Nodes
            Node dummy = new Node(-1);
            Node temp = dummy;
            curr = head;
            while(curr != null){
                Node forw = curr.next.next;
                temp.next = curr.next;
                temp = temp.next;
                curr.next = forw;
                curr = forw;
            }

            return dummy.next;
        }
    }


}
