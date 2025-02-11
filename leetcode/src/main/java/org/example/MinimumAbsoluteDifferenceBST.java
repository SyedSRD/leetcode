package org.example;

public class MinimumAbsoluteDifferenceBST {



    private int Min = Integer.MAX_VALUE;;
    public int getMinimumDifference(TreeNode root) {

        Min = minDiff(root,Min);
        System.out.println(Min);
        if(root.left == null) {
            return Math.min(getLeftMostRightTree(root.right) - root.val,Min);
        }
        if(root.right == null){
            return Math.min(root.val - getRightMostLeftTree(root.left),Min);
        }


        return Math.min(Math.min(root.val - getRightMostLeftTree(root.left),Min),Math.min(getLeftMostRightTree(root.right) - root.val,Min));

    }

    public int minDiff(TreeNode root, int min){
        if(root == null )
            return min;
        else if (root.left != null )
            min = Math.min(root.val - root.left.val,min);
        else if( root.right != null)
            min = Math.min(root.right.val - root.val, min);

        return Math.min(minDiff(root.left,min),minDiff(root.right,min));
    }
    public int getLeftMostRightTree(TreeNode treeNode){
        while (treeNode.left != null)
            treeNode = treeNode.left;

        return treeNode.val;
    }
    public int getRightMostLeftTree(TreeNode treeNode){
        while (treeNode.right != null)
            treeNode = treeNode.right;

        return treeNode.val;
    }
}
