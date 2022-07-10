package competative.practice.BinaryTree;

// Create Node Class for things we required for process
// Create Binary Tree class | from -1 index increamnet | create new node inside buildtree inbuild fn and pass array nodes | new node left form buildtree(node)
// sout rooot ---> print 1
// pre order traversal --> print all numbers - root - leftsubtree - rightsubtree
// in order traversal - leftsubtree - root - right subtree
// Post order traversal => left subtree right subtree and root
// level Order'=
//Count of Nodes


import java.util.LinkedList;
import java.util.Queue;

public class BinarytreeY {

    // Node class and constructor
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;

            if(nodes[index] == -1){
                return null ;
            }

            // Create new node
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // Preorder Traversal - Recursion
    public static void preorder(Node root){
        if(root == null) {return;}
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //Inorder traversal - BIG(O)N - complexcity - Recursion
    public static void inorder(Node root){
        if(root == null){ return;}
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // post order traversal -  BIG(O)N - complexcity - Recursion
    public static void postorder(Node root){
        if(root == null){return;}
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal - Itration - Queue - FIFO ==> 1 null 2 3 null 4 5 null 6 (BFS - brute first BIG(O)n (level order travesal) DFS - (pre post inorder traversal )
    public static void levelOrder(Node root){
        if(root == null){return;}
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node curr = queue.remove();
            if(curr == null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }

    }

    //Count of Nodes x + y +1 =  1 for root - recursion - BIG(O)N

    public static int countOfNodes(Node root){
        if(root == null){return 0; }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);
        return leftNode + rightNode + 1;
    }

    // Sum of Nodes - - BIG(O)N
    public static int sumOfNodes(Node root){
        if(root == null){return 0; }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // Height of Tree --BIG o
    public static int Height(Node root){
        if(root == null){return 0; }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    // Daimeter -- No of nodes  the longest path between y 2 nodes.
    // case 2: daimeter NOT root through
    // Approch1 : left subtree daimeter , right subtree daimeter, LH + RH + 1
    // BIG (O) n2

    public static int diameter(Node root){
        if(root == null){return 0; }
        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = Height(root.left) + Height(root.right) + 1;
        return Math.max(d3, Math.max(d1, d2));
    }

    // Aprroch2 :- BIG (O)N
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1 ;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }

    // Subtree of another tree => First match root => not matched  => then match with left subtree and right subtree root try matching


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        BinaryTree tree = new BinaryTree();
//        Node root = tree.buildTree(nodes);

        Node root = BinaryTree.buildTree(nodes);

       System.out.println(diameter2(root).diam);
    }
}
