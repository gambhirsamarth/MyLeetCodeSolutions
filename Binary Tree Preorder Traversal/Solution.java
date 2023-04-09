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

    public void traversal(TreeNode root, List<Integer> res) {
       
        // Return if the current node is null
        //base case
        if(root == null) return;
        
        // Add the current node's value to the result list
        res.add(root.val);
        
        // Recursively traverse the left and right subtrees
        traversal(root.left, res);
        traversal(root.right, res);
   }

    public List<Integer> preorderTraversal(TreeNode root) {
        // Creating a list to store the traversal result
        //Initialization
        List<Integer> res = new ArrayList<>();
        
        // To perform the traversal
        traversal(root, res);
        
        // Return the result
        return res;
   }
    
}
