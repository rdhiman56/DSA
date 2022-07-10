package com.competative.linkedlist;

public interface ReorderLLFold {

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

    class gfg {

        Node middle(Node head){
            if(head == null || head.next == null){
                return head;
            }

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        Node reverseLL(Node head){
            if(head == null || head.next == null){
                return head;
            }

            Node prev = null;
            Node curr = head;
            Node forword = null;

            while(curr != null){
                forword = curr.next; // backup
                curr.next = prev; // link
                prev = curr;
                curr = forword;
            }
            return prev;
        }


        Node reorderlist(Node head) {
            // Your code here


            Node mid = middle(head);
            Node newHead = mid.next;
            mid.next = null;

            newHead = reverseLL(newHead);

            Node c1 = head;
            Node c2 = newHead;
            Node f1 = null;
            Node f2 = null;

            while(c2 != null){
                // backup create
                f1 = c1.next;
                f2 = c2.next;

                //links
                c1.next = c2;
                c2.next = f1;

                // Move
                c1 = f1;
                c2 = f2;
            }

            return head;
        }
    }

}
