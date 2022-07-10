package competative.practice.linkedlist;

import java.util.Stack;


public class ReverseLL {

        Node head;

        class Node {
            int data;
            Node next;

            Node(int d){
                data = d;
                next = null;
            }
        }

        // Iterative Method
        //Time complexity - O(n)
        //Space complexity - O(1)
        public void reverseList_Iterative()
        {
            if(head == null || head.next == null) {
                return;
            }

            Node prevNode = head;
            Node currNode = head.next;
            while(currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = prevNode;
        }

        //Iterative Method using stack
        //Time complexity - O(n)
        //Space complexity - O(n)
        public void reverseList_Iterative_Stack(Node head)
        {
            // store Node addresses in stack
            Stack<Node> stk = new Stack<Node>();
            Node ptr = head;
            while (ptr != null) {
                stk.push(ptr);
                ptr = ptr.next;
            }

            // print data from stack
            while (!stk.isEmpty()) {
                System.out.print(stk.peek().data + " ");
                stk.pop(); // pop after print
            }
            System.out.println("\n");
        }

        //Recursive Method
        //Time complexity - O(n)
        //Space complexity - O(1)
        public Node reverseList_Recursive(Node head)
        {
            //empty node || last node or only one node
            if(head == null || head.next == null) {
                return head;
            }

            Node newHead = reverseList_Recursive(head.next);

            head.next.next = head;
            head.next = null;
            return newHead;
        }

        // Add First LL
        public void reverseAddFirst(Node head) {
            Node th = null;
            Node tl = null;
            Node curr = head;

            if (th == null) {
                th = curr;
                tl = curr;
            } else {
                curr.next = th;
                th = curr;
            }
        }

        public void reversget(){
            Node curr = head;
            while (curr != null){
                Node next = curr.next;
                curr.next = null;
                reverseAddFirst(curr);
                curr = next;
            }
        }
    }
