package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        List<Integer> lvl;
        Queue<TreeNode> q = new ArrayDeque();
        TreeNode node;
        if(root == null)
            return new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int qln = q.size();
            lvl = new ArrayList<>();
            while(qln-- != 0) {
                System.out.println(qln);
                node = q.poll();
                if(node != null) {
                    lvl.add(node.val);
                    if (node.left != null)
                        q.add(node.left);
                    if (node.right != null)
                        q.add(node.right);
                }
            }
            rs.add(lvl);
        }
        return rs;
    }
}























