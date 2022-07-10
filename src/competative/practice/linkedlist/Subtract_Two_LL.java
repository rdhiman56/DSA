package competative.practice.linkedlist;

public class Subtract_Two_LL {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Solution {
        // reverse LL


        static Node zeroatFront(Node head) {
            Node c = head;

            if (c.next != null && c.data == 0) {
                return zeroatFront(c.next);
            } else {
                return c;
            }
        }

        static int findLength(Node head) {
            if (head == null) {
                return 0;
            }

            int len = 0;

            while (head != null) {
                head = head.next;
                len++;
            }

            return len;
        }

        static Node reverseLL(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node nextptr = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextptr;
            }

            return prev;
        }

        static Node subtration(Node n1, Node n2) {

            Node l1 = n1;
            Node l2 = n2;

            l1 = reverseLL(l1);
            l2 = reverseLL(l2);

            int borrow = 0;
            int diff;

            Node res = new Node(-1);
            Node temp = res;

            while (l1 != null) {

                diff = borrow + l1.data - ((l2 != null) ? l2.data : 0);

                if (diff < 0) {
                    borrow = -1;
                    diff = 10 + diff;
                } else {
                    borrow = 0;

                }

                temp.next = new Node(diff);
                temp = temp.next;

                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }

            Node result = reverseLL(res.next);
            return zeroatFront(result);
        }


        static Node findLargestLL(Node l1, int lenL1, Node l2, int lenL2) {

            Node temp1 = l1;
            Node temp2 = l2;

            if (lenL1 > lenL2) {
                temp1 = l1;
                temp2 = l2;
            } else if (lenL2 > lenL1) {
                temp1 = l2;
                temp2 = l1;
            } else {
                while (temp1 != null && temp2 != null) {
                    if (temp1.data > temp2.data) {
                        temp1 = l1;
                        temp2 = l2;
                        break;
                    } else if (temp1.data < temp2.data) {
                        temp1 = l2;
                        temp2 = l1;
                        break;
                    }
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
                if (temp1 == null && temp2 == null) {
                    Node newNode = new Node(0);
                    return newNode;
                }
            }
            return subtration(temp1, temp2);
        }


        static Node subLinkedList(Node l1, Node l2) {
            // code here
            // remove zeroth
            l1 = zeroatFront(l1);
            l2 = zeroatFront(l2);

            // find length
            int lenL1 = findLength(l1);
            int lenL2 = findLength(l2);

            if (lenL1 == 1 && l1.data == 0) {
                return l2;

            }
            if (lenL2 == 1 && l2.data == 0) {
                return l1;
            }

            // Find largest ll
            return findLargestLL(l1, lenL1, l2, lenL2);

        }
    }
}
