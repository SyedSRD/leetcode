package org.example;

public class FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        dfs(root);
    }

    public TreeNode dfs(TreeNode root){
        if(root== null)
            return root;

        TreeNode leftTail = dfs(root.left);
        TreeNode rightTail = dfs(root.right);

        if(root.left != null){
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        return rightTail!= null?rightTail: (leftTail != null?leftTail:root);
    }
}
