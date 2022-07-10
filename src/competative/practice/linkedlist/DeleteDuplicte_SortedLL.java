package competative.practice.linkedlist;

public class DeleteDuplicte_SortedLL {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    class GfG
    {
        //Function to remove duplicates from sorted linked list.
        Node removeDuplicates(Node head)
        {
            // Your code here
            Node first = head;
            Node second = head.next;

            if(head == null || head.next == null){
                return head;
            }

            while(second != null && first !=null){
                if(first.data == second.data){
                    first.next = second.next;
                    first = first.next;
                    second = second.next;
                } else {
                    first = first.next;
                    second = second.next;
                }

            }

            return head;
        }
    }
}
