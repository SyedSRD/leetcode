package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class BinaryTreefromPreorderandInorder {

//    public  TreeNode buildTree(int[] preorder, int[] inorder) {
//        TreeNode root = new TreeNode();
//
//        root.val = preorder[0];
//        int mid = Arrays.asList(inorder).indexOf(preorder[0]);
//        root.left = buildTree(ArrayUtils.toPrimitive(Arrays.asList(preorder).subList(1,mid+1).toArray(new Integer[0])),
//                ArrayUtils.toPrimitive(Arrays.asList(inorder).subList(0,mid).toArray(new Integer[0])));
//        root.right = buildTree(ArrayUtils.toPrimitive(Arrays.asList(preorder).subList(mid+1,preorder.length).toArray(new Integer[0])),
//                ArrayUtils.toPrimitive(Arrays.asList(inorder).subList(mid,inorder.length).toArray(new Integer[0])));
//
//
//        return root;
//
//    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode();
        if (preorder.length < 1 || inorder.length < 1)
            return null;

        root.val = preorder[0];

        int mid = IntStream.range(0, inorder.length).filter(i -> inorder[i] == root.val).findFirst().orElse(-1);
        System.out.println(mid);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, mid+1),
                Arrays.copyOfRange(inorder, 0, mid));
       root.right = buildTree(Arrays.copyOfRange(preorder,  mid+1, preorder.length),
                Arrays.copyOfRange(inorder,  mid, inorder.length));


        return root;
    }


}
