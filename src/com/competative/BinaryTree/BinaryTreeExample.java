package com.competative.BinaryTree;

public class BinaryTreeExample {
    // create binary tree Node Class
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Static Binary tree Class
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree (int nodes[]){
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        };
    }

    // Preorder Tree
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + " Root");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
        preorder(root);
    }
}