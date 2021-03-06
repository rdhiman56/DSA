package com.competative.linkedlist;

public class flatningLL {

class Node
{
	int data;
	Node next;
	Node bottom;

	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


    class GfG
    {

        Node mergesort(Node a, Node b) {
            if(a == null) { return b; }
            if(b == null) { return a; }

            Node res = new Node(0);
            Node temp = res;

            while (a != null && b != null){
                if(a.data <= b.data){
                    temp.bottom = a;
                    temp = temp.bottom;
                    a = a.bottom;
                }else{
                    temp.bottom = b;
                    temp = temp.bottom;
                    b = b.bottom;
                }
            }

            while (a != null ){
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }

            while (b != null){

                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }

            return res.bottom;

        }

        Node flatten(Node root)
        {
            // Your code here
            if(root == null || root.next ==  null){
                return root;
            }

            root.next = flatten(root.next);
            return mergesort(root, root.next);
        }
    }
}
