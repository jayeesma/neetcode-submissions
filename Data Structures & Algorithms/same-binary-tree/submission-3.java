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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        boolean res = false;

       
        if(p==null && q==null) {
            return true;
        } 

        if(p==null || q==null) {
            return false;
        }

        TreeNode pleft = p.left;
        TreeNode qLeft = q.left; 
        TreeNode pRight = p.right;
        TreeNode qRight = q.right; 

        if(p.val == q.val 
            && isSameTree(pleft,qLeft) && isSameTree(pRight,qRight) ) {
            res= true;
        }

        return res;
    }
}
