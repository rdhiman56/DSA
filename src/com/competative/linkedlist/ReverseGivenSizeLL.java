package com.competative.linkedlist;

public class ReverseGivenSizeLL {

    class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }

    class Solution
    {

        public static Node reverse(Node node, int k)
        {
            if(node == null || node.next == null) {
                return node;
            }

            Node prevNode = null;
            Node currNode = node;
            Node nextNode = null;
            int counter = 0;

            while(currNode != null && counter < k) {
                nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
                counter++;
            }

            if(nextNode != null){
                node.next = reverse(nextNode, k);
            }

            return prevNode;

        }

    }


}
