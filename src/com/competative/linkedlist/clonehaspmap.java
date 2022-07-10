package com.competative.linkedlist;

public class clonehaspmap {
//    class Clone2 {
//
//        //Function to clone a linked list with next and random pointer.
//        Node copyList(Node head) {
//            HashMap<Node, Node> map = new HashMap<>();
//            return dfs(head, map);
//        }
//
//        private Node dfs(Node node, HashMap<Node, Node> map) {
//            if (node == null) {
//                return node;
//            }
//            if (map.containsKey(node)) {
//                return map.get(node);
//            }
//            Node copy = new Node(node.data);
//            map.put(node, copy);
//
//            copy.next = dfs(node.next, map);
//            copy.arb = dfs(node.arb, map);
//
//            return copy;
//        }
//
//
//    }

//
//    class Clone3{
//        Node copyList(Node head) {
//
//            HashMap<Node, Node> map = new HashMap<>();
//
//            Node curr = head;
//
//            Node nHead = new Node(-1);
//            Node prev = nHead;
//
//            while (curr != null) {
//                Node node = new Node(curr.data);
//
//                prev.next = node;
//
//                map.put(curr,node);
//
//                prev= prev.next;
//                curr=curr.next;
//
//            }
//
//            nHead = nHead.next;
//            Node c1 = head;
//            Node c2 = nHead;
//
//            while(c1!=null){
//                c2.arb = (c1.arb != null ? map.get(c1.arb) : null);
//
//                c1=c1.next;
//                c2=c2.next;
//            }
//            return nHead;
//        }
//
//    }
}
