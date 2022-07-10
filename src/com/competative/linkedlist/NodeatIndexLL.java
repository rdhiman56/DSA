package com.competative.linkedlist;

public class NodeatIndexLL {
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

    class GfG
    {

        public static int getNth(Node node, int ind)
        {
            //Your code here
            Node curr = node;

            if(node == null || node.next == null){
                return -1;
            }

            for(int i=1; i<=ind;i++){
                if(i == ind){
                    return curr.data;
                }
                curr = curr.next;
            }
            return -1;
        }
    }
}
