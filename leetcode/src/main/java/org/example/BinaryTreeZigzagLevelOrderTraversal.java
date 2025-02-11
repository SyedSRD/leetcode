package org.example;

import java.lang.foreign.StructLayout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        List<Integer> lvl;
        Queue<TreeNode> q = new ArrayDeque();
        TreeNode node;
        Boolean rv = false;
        if(root == null)
            return  new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int qln = q.size();
            lvl = new ArrayList<>();
            System.out.println(qln);
            while(qln-- != 0) {
                node = q.poll();
                if(node != null) {
                    lvl.add(node.val);
                    if (node.left != null)
                        q.add(node.left);
                    if (node.right != null)
                        q.add(node.right);
                }
            }
            if (rv) {
                lvl = lvl.reversed();
                rv = false;
            } else
                rv = true;
            rs.add(lvl);
        }
        return rs;

    }
}
