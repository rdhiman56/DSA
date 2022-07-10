package competative.practice.linkedlist;

public class intersactionLL {

 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class LinkedList
{
    Node head;  // head of list
}

    class Intersect {
        //Function to find intersection point in Y shaped Linked Lists.
        int intersectPoint(Node head1, Node head2)
        {
            Node a = head1;
            Node b = head2;

            if(a == null || b == null){
                return -1;
            }

            int len1 =0;
            int len2 = 0;
            int d=0;

            while (a!= null){
                a = a.next;
                len1++;
            }

            while (b!= null){
                b = b.next;
                len2++;
            }

            if(len1 > len2){
                d = len1 - len2;
                a = head1;
                b = head2;
            }else {
                d = len2 - len1;
                b = head1;
                a = head2;
            }


            while(d != 0){
                a = a.next;
                d--;

                if(a == null){return -1;}

            }

            while(a!=null && b!=null){
                a= a.next;
                b= b.next;
                if(a==b){
                    return a.data;
                }
            }
            return -1;
        }
    }

}
