/* 1530. Number of Good Leaf Nodes Pairs */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    public int countPairs(TreeNode root, int distance) {
        dist(root, distance);
        return count;
    }

    private List<Integer> dist(TreeNode root, int distance){
        if (root == null) return new ArrayList<Integer>();

        if (root.left == null && root.right == null){
            List<Integer> subList = new ArrayList();
            subList.add(1);
            return subList;
        }

        List<Integer> leftDist = dist(root.left, distance);       
        List<Integer> rightDist = dist(root.right, distance);
        
        for (int d1: leftDist){
            for (int d2: rightDist){
                if (d1 + d2 <= distance){
                    count++;
                }
            }
        }
        List<Integer> list = new ArrayList();
        for (int val : leftDist){
            list.add(val + 1);
        }
        for (int val : rightDist){
            list.add(val + 1);
        }

        return list;
    }
}
