package org.example;

import java.util.Stack;

public class KthSmallestElementBST {

    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        int n = 0;
        TreeNode cur = root;

        while ((cur != null) && !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.println(cur.val);
            n++;
            if (k == n)
                break;
            cur = cur.right;

        }
        return root.val;
    }
}
