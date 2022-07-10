//package competative.practice.linkedlist;
//
//import java.util.LinkedHashSet;
//
//public class IntersectionTwoLL_Compar {
//
//class Node
//{
//    int data;
//    Node next;
//
//    Node(int a)
//        {
//            data = a;
//            next = null;
//        }
//}
//
//    class Solution
//    {
//
//        public static Node findIntersection(Node head1, Node head2)
//        {
//            // add your code here
//            // return the head of intersection list
//            if(head1 == null || head2 == null){
//                return null;
//            }
//
//            Node l1 = head1;
//            Node l2 = head2;
//
//            LinkedHashSet<Integer> hashval = new LinkedHashSet<>();
//
//            while(l2 != null){
//                hashval.add(l2.data);
//                l2 = l2.next;
//            }
//
//            Node newNode = new Node(-1);
//            Node temp = newNode;
//
//            while(l1 != null){
//                if(hashval.contains(l1.data) == true){
//                    temp.next = new Node(l1.data);
//                    temp = temp.next;
//                }
//                l1 = l1.next;
//            }
//            return newNode.next;
//        }
//    }
//}
