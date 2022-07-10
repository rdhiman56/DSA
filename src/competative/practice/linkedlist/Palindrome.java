package competative.practice.linkedlist;

public class Palindrome {

    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
            //Function to check whether the list is palindrome.

            static Node Middle(Node head){
                Node slow = head;
                Node fast = head;

                while(fast.next != null && fast.next.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow;

            }

            static Node reverse(Node head){
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

            boolean isPalindrome(Node head)
        {
            //Your code here
            if (head == null || head.next == null) {
                return true;
            }

            Node firstStart = head;
            Node firstEnd = Middle(head);
            Node secondhalf = reverse(firstEnd.next);

            while (secondhalf != null) {
                if (firstStart.data != secondhalf.data) {
                    return false;
                }
                firstStart = firstStart.next;
                secondhalf = secondhalf.next;

            }
            return true;

        }
    }
