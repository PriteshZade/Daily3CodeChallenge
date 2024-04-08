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
 //public static count = 0;
class Solution {

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer>a= new ArrayList<>();
        giveSorted(root,a);
        return a.get(k-1);
    }
    public void giveSorted(TreeNode root, ArrayList<Integer>a){
        if(root==null){
            return ;
        }
        giveSorted(root.left,a);
        a.add(root.val);
        giveSorted(root.right,a);
    }

}