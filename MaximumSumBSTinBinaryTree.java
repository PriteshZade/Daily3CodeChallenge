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
    public class Info {
        int maxSum;
        boolean isValid;
        int min;
        int max;
        int sum;

        public Info(int maxSum, boolean isValid, int min, int max, int sum) {
            this.maxSum = maxSum;
            this.isValid = isValid;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    public int maxSumBST(TreeNode root) {
        return maxSum2(root).maxSum;
    }

    public Info maxSum2(TreeNode root) {
        if (root == null) {
            return new Info(0, true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        Info leftInfo = maxSum2(root.left);
        Info rightInfo = maxSum2(root.right);

        int min = Math.min(root.val, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.val, Math.max(leftInfo.max, rightInfo.max));
        int sum = leftInfo.sum + rightInfo.sum + root.val;
        boolean isValid = leftInfo.isValid && rightInfo.isValid &&
                          root.val > leftInfo.max && root.val < rightInfo.min;

        int maxSum = Math.max(leftInfo.maxSum, rightInfo.maxSum);
        if (isValid) {
            maxSum = Math.max(maxSum, sum);
        }

        return new Info(maxSum, isValid, min, max, sum);
    }
}
