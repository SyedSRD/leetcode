

package org.example;

import java.util.Arrays;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        LongestSubstring lst = new  LongestSubstring();
//        System.out.println(lst.lengthOfLongestSubstring("pwwkew"));

//        RansomNote rn = new RansomNote();
//        System.out.println(rn.canConstruct("aa","abcad"));

//        Isomorphic is = new Isomorphic();
//        System.out.println(is.isIsomorphic("badc","baba"));
//        System.out.println(is.isIsomorphic("dgg","add"));

//        WordPatt patt = new WordPatt();
//        System.out.println(patt.wordPattern("abba","dog cat cat dog cat"));
//        System.out.println(patt.wordPattern("abba","dog cat cat fish"));
//        System.out.println(patt.wordPattern("aaaa","dog cat cat dog"));

//        ValidAnagram va = new ValidAnagram();
//        System.out.println(va.isAnagram("abba","bbaa"));
//        System.out.println(va.isAnagram("anagram","nagaram"));
//        System.out.println(va.isAnagram("rat","car"));

//        TwoSum ts = new TwoSum();
//        int[] input = {-1,-2,-3,-4,-5};
//        System.out.println(Arrays.toString(ts.twoSum(input,-8)));

//        HappyNumber hp = new HappyNumber();
//        System.out.println(hp.isHappy(4));

//        ContainsDuplicate cd = new ContainsDuplicate();
//        System.out.println(cd.containsNearbyDuplicate(new int[]{1,2,3,1},1));

//        SummaryRanges sr = new SummaryRanges();
//        System.out.println(sr.summaryRanges(new int[]{0,1,2,4,5,7,8,9,11,12}));

//        StackBracket sb = new StackBracket();
//        System.out.println(sb.isValid("([]{()}[])"));
//        System.out.println(sb.isValid(""));
//        System.out.println(sb.isValid(")"));

//        LinkedListCycle linkedListCycle = new LinkedListCycle();
//        linkedListCycle.addNode(5);
//        linkedListCycle.addNode(6);
//        linkedListCycle.addNode(7);
//        linkedListCycle.addNode(8);
//        linkedListCycle.addCycle();
//        System.out.println(linkedListCycle.hasCycle());
//
//        TreeNode treeNode = new TreeNode(1);
//        treeNode.left = new TreeNode(1);
//        treeNode.right = new TreeNode(2);
//        treeNode.left.left  =new TreeNode(3);
//        treeNode.left.right =new TreeNode(4);
//        treeNode.right.left =new TreeNode(4);
//        treeNode.right.right=new TreeNode(3);

//        SymmetricTree symmetricTree = new SymmetricTree();
//        System.out.println(symmetricTree.isSymmetric(treeNode));

//        AverageLevelsBinaryTree averageLevelsBinaryTree = new AverageLevelsBinaryTree();
//        System.out.println(averageLevelsBinaryTree.averageOfLevels(treeNode));

//        System.out.println(SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5));
//        System.out.println(SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 0));

//        System.out.println(Binary.reverseBits(101));
//        System.out.println(Arrays.toString(MathProb.plusOne(new int[]{9})));

//        System.out.println(RomanInteger.romanToInt("MCMXCIV"));

//        System.out.println(GasStation.canCompleteCircuit(new int[]{5,1,2,3,4}, new int[]{4,4,1,5,1}));
//        System.out.println(ZigzagConversion.convert("PAYPALISHIRING",3));
//        System.out.println(ThreeSum.threeSum(new int[]{-4, -1, -1, 0, 1, 2}));
//        System.out.println(SpiralMatrix.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));

//        System.out.println(GroupAnagrams.groupAnagrams(new String[]{"tea","eat","tan","nat","ant","bat"}));

//        System.out.println(Arrays.toString(InsertInterval.insert(new int[][]{{1,3},{6,9}},new int[]{2,5})[0]));

//        System.out.println(PolishNotation.evalRPN(new String[]{"4","13","5","/","+"}));

        ListNode node = new ListNode(1);
        node.next =new ListNode(1);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(4);

//        System.out.println(RemoveNthNodeFromEndList.removeNthFromEnd(node,1));
        System.out.println(RemoveDuplicatesfromSortedListII.deleteDuplicates(node));

    }
}