package org.example;

public class PopulatingNextRightPointersinEachNodeII {
    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {

        Node cur = root;
        Node next = (root!= null?root.left:null);

        while (cur!=null && next !=null){
            if(cur.left!= null && cur.right != null)
                cur.left.next = cur.right;
            else if( cur.next!= null)
                cur.left.next = cur.next.left!=null?cur.next.left:cur.next.right;
            if(cur.next!= null && cur.right!=null)
                cur.right.next = cur.next.left!=null?cur.next.left:cur.next.right;
            cur = cur.next;

            if(cur==null){
                cur = next;
                next = cur.left;
            }
        }
        return root;

    }
}
