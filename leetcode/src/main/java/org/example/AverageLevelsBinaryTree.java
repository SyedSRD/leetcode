package org.example;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AverageLevelsBinaryTree {

    private  Map numMap = new HashMap<Integer,Double[]>();
    private  List<Double> list = new ArrayList<Double>();
    public List<Double> averageOfLevels(TreeNode root) {
        createHash(root,0);

        numMap.forEach((k,v) -> {
                Double[] array = (Double[]) v;
                Double avg = array[0]/array[1];
                list.add(avg);

        });

        return list;
    }

    public void createHash(TreeNode treeNode, int level){

        if(treeNode == null) {
            return;
        }
        //System.out.println(level);
        if (!numMap.containsKey(level)) {
            numMap.put(level, new Double[] { (double)treeNode.val, 1.0 });
        }
        else {
            Double[] temp = (Double[]) numMap.get(level);
            temp[0] += treeNode.val;
            temp[1] += 1;
            numMap.put(level, temp);
        }


        createHash(treeNode.left,level + 1);
        createHash(treeNode.right,level + 1);

    }
}
