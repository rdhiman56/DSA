package competative.practice.linkedlist;

public class mergesort {
    static class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            this.data = key;
            next = null;
        }
    }

    class Solution
    {
        //Function to sort the given linked list using Merge Sort.

        static Node middle(Node head){
            Node slow = head;
            Node fast = head.next;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }

        static Node mergeList(Node left, Node right){
            if(left == null ){
                return right;
            }
            if(right ==null){
                return left;
            }
            Node res = new Node(0);
            Node temp = res;
            while(left != null && right != null){
                if(left.data <= right.data){
                    temp.next = left;
                    temp = temp.next;
                    left = left.next;
                }else {
                    temp.next = right;
                    right = right.next;
                    temp = temp.next;
                }
            }

            while(left != null){
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }

            while(right != null){
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }

            return res.next;
        }

        static Node mergeSort(Node head)
        {
            // add your code here
            if(head == null || head.next == null){
                return head;
            }

            Node mid =middle(head);
            Node left = head;
            Node right = mid.next;
            mid.next = null;

            left = mergeSort(left); // Divide Left
            right = mergeSort(right);

            return mergeList(left, right);
        }
    }
}
