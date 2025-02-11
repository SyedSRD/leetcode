package org.example;

public class SumRoottoLeafNumbers {

    public int sumNumbers(TreeNode root) {

      return dfs(root,0);
    }

    int dfs(TreeNode node, int val){

        if (node == null)
            return 0;
        val = val*10 + node.val;
        if(node.right == null && node.left == null)
            return val;


        return  dfs(node.left,val) + dfs(node.right, val);
    }
}
