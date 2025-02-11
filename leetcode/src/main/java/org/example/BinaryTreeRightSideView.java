package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lvl = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque();
        TreeNode node;
        TreeNode rightMostChild;
        if(root == null)
            return new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int qln = q.size();
            rightMostChild = null;

            while(qln-- != 0) {
                node = q.poll();
                if(node != null) {
                    rightMostChild = node;
                    if (node.left != null)
                        q.add(node.left);
                    if (node.right != null)
                        q.add(node.right);


                }
            }
            lvl.add(rightMostChild.val);

        }
        return lvl;

    }

}
