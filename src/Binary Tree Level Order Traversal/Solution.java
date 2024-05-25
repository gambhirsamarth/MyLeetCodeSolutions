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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // declare queue and list of list
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        
        // if root is null,  return the answer
        if(root==null){
            return finalAns;
        }

        // else add it to the queue
        q.add(root);
        
        // while queue is having elements,
        while(!q.isEmpty()){
            // create a list that will store elements of that level
            // take a variable levels,  to traverse the queue
            int levels = q.size();
            List<Integer> subLevels = new ArrayList<>();

            // if left or right is not null, add it to queue
            // then add value in queue to the ans vector
            for(int i=0;i<levels;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                subLevels.add(q.remove().val);
            }
            // finally add thr vector to the final answer
            finalAns.add(subLevels);
        }
        // return final ans at the end
        return finalAns;
    }
}
