package org.example;

public class InvertBinaryTree {
    TreeNode treeNode = new TreeNode();
    public TreeNode invertTree(TreeNode root) {

        if(root == null)
            return root;


        treeNode = root.right;
        root.right = root.left;
        root.left = treeNode;

        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}
