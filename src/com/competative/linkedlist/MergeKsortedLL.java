package com.competative.linkedlist;

public class MergeKsortedLL {

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


// a is an array of Nodes of the heads of linked lists
// and N is size of array a


    class Solution
    {

        Node divideList(Node arr[], int start, int end) {

            if(start == end){
                return arr[start];
            }

            if(start > end){
                return null;
            }

            int mid = start + (end - start)/2;

            Node left = divideList(arr, start, mid);
            Node right = divideList(arr, mid+1, end);
            return mergeList(left, right);
        }

        Node mergeList(Node left, Node right) {
            Node res = new Node(0);
            Node temp = res;


            if(left == null){
                return right;
            }

            if(right == null){
                return left;
            }

            while(left != null && right != null){
                if(left.data <= right.data){
                    temp.next = left;
                    temp = temp.next;
                    left = left.next;
                } else{
                    temp.next = right;
                    temp = temp.next;
                    right = right.next;
                }
            }

            while(left != null){

                temp.next = left;
                temp = temp.next;
                left = left.next;
            }

            while(right != null){
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }

            return res.next;

        }
        //Function to merge K sorted linked list.
        Node mergeKList(Node[]arr,int k)
        {
            //Add your code here.
            if(k == 0){
                return null;
            }
            return divideList(arr,0,k-1);
        }
    }

}
