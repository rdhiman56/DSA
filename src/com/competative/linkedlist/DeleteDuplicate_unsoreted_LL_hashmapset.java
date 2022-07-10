package com.competative.linkedlist;

import java.util.HashMap;
import java.util.HashSet;

public class DeleteDuplicate_unsoreted_LL_hashmapset {
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}


    class Solution
    {
        //Function to remove duplicates from unsorted linked list.
        public Node removeDuplicates_HashMap(Node head)
        {
            // Your code here
            HashMap<Integer, Boolean> hash = new HashMap<>();

            Node curr = head;
            hash.put(curr.data, true);


            Node prev = curr;
            curr = curr.next;

            while(curr != null){
                if(hash.containsKey(curr.data)){
                    prev.next = curr.next; // delete node
                }else {
                    hash.put(curr.data, true);
                    prev=curr;
                }
                curr = curr.next;
            }

            return head;


        }

        //hash set
        public Node removeDuplicates_Hashset(Node head)
        {
            // Your code here

            if(head == null || head.next == null){
                return head;
            }
            HashSet<Integer> hash = new HashSet<>();


            Node prev = head;
            Node curr = head.next;
            hash.add(prev.data);

            while(curr != null){
                if(hash.contains(curr.data)){
                    prev.next = curr.next;
                }else {
                    hash.add(curr.data);
                    prev = curr;
                }
                curr = curr.next;
            }

            return head;
        }
    }

}
