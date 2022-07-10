package competative.practice.linkedlist;

public class add_one_ll {

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


    class Solution
    {
        //reverse
        public Node reverse(Node head){
            Node prev = null;
            Node curr = head;

            while (curr != null){
                Node nextptr = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextptr;
            }
            return prev;
        }

        public Node addition(Node head){
            int carry = 1;
            int sum = 0;

            if(head == null){
                return head;
            }

            Node curr = head;
            Node res = new Node(-1);
            Node temp = res;

            while (curr!=null){
                sum = carry + curr.data; // 10
                carry = (sum > 9) ? 1 : 0; // 10 > 9 = 1
                sum = sum % 10;
                temp.next = new Node(sum);
                temp = temp.next;
                curr = curr.next;
            }

            if(carry > 0){
                temp.next = new Node(carry);
            }
            return res.next;
        }

        public Node addOne(Node head)
        {
            //code here.
            Node rev = reverse(head);
            Node result = addition(rev);
            Node finalres = reverse(result);

            return finalres;
        }
    }

}
