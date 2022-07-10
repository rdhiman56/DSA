package competative.practice.linkedlist;

public class loopLength {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

//Function should return the length of the loop in LL.

    class Solution
    {
        //Function to find the length of a loop in the linked list.
        static int countNodesinLoop(Node head)
        {
            //Add your code here.
            if(head == null || head.next == null){
                return 0;
            }

            Node slow = head;
            Node fast = head.next;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    int k =1;
                    Node temp = slow;
                    while(slow != temp.next){
                        temp = temp.next ;
                        k++;
                    }
                    return k;
                }

            }
            return 0;

        }
    }
}
