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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth-1<=0){
            TreeNode newRoot = new TreeNode(val,root,null);
            return newRoot;
        }
        Solve(root,val,depth,1);
        return root;
    }
    public void Solve(TreeNode root, int val, int depth,int d){
        if(root==null){
            return ;
        }
        
        if(d==depth-1){
            TreeNode l = new TreeNode(val,root.left,null);
            TreeNode r = new TreeNode(val,null,root.right);
            root.left = l;
            root.right =r;
            return;
        }
        Solve(root.left,val,depth,d+1);
        Solve(root.right,val,depth,d+1);

    }
}