package com.competative.linkedlist;

public class additionLL {

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

    class Solution{
        //Function to add two numbers represented by linked list.
        Node reverseLL(Node head){
            Node prev = null;
            Node curr = head;

            while(curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            return prev;
        }

        Node addition (Node first, Node second){
            if(first == null){
                return second;
            }

            if(second == null){
                return first;
            }

            int carry = 0;
            int sum = 0;
            int digit;

            Node res = new Node(-1);
            Node temp = res;

            while (first != null || second != null || carry != 0){
                sum = (first != null ? first.data : 0) + (second != null ? second.data : 0) + carry;
                carry = sum / 10;
                digit = sum % 10;
                temp.next = new Node(digit);
                temp = temp.next;

                if(first != null){
                    first = first.next;
                }

                if(second != null){
                    second = second.next;
                }
            }

            return res.next;

        }

        Node addTwoLists(Node first, Node second){
            // code here
            first =reverseLL(first);
            second = reverseLL(second);

            Node add = addition(first, second);

            return reverseLL(add);
            // return head of sum list
        }
    }
}
