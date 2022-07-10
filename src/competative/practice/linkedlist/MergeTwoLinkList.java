package competative.practice.linkedlist;

public class MergeTwoLinkList {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    class LinkedList
    {
        //Function to merge two sorted linked list.
        Node sortedMerge(Node head1, Node head2) {
            // This is a "method-only" submission.
            // You only need to complete this method

            if(head1 == null){
                return head2;
            }

            if (head2 == null){
                return head1;
            }

            Node idx1 = head1; // First List
            Node idx2 = head2;

            Node res = new Node(0); // res head
            Node temp = res;

            while(idx1 != null && idx2 != null){
                if(idx1.data <= idx2.data){
                    temp.next = idx1;
                    idx1 = idx1.next;
                    temp = temp.next;
                }else{
                    temp.next = idx2;
                    idx2 = idx2.next;
                    temp = temp.next;
                }
            }

            while(idx1 != null){
                temp.next = idx1;
                idx1 = idx1.next;
                temp = temp.next;
            }

            while(idx2 != null){
                temp.next = idx2;
                idx2 = idx2.next;
                temp = temp.next;
            }

            return res.next;
        }
    }

}
