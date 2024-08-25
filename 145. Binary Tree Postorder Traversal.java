/* 145. Binary Tree Postorder Traversal */

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode currentNode, List<Integer> result){
        if (currentNode == null) return;

        helper(currentNode.left, result);
        helper(currentNode.right, result);

        result.add(currentNode.val);
    }
}
