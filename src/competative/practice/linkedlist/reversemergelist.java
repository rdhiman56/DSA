package competative.practice.linkedlist;

public class reversemergelist {

    /* Structure of the node*/
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

    class GfG
    {

        Node reverseList(Node head) {
            Node curr = head;
            Node prev = null;

            while(curr!= null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;

        }

        Node mergeResult(Node node1, Node node2)
        {
            // Your code here
            Node idx1 = node1;
            Node idx2 = node2;

            if(idx1 == null){
                return idx2;
            }

            if(idx2 == null){
                return idx2;
            }

            Node res = new Node(0);
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

            return reverseList(res.next);


        }
    }

}
