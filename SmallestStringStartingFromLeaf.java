class Solution {
    public String smallestFromLeaf(TreeNode root) {
        // Start the recursion from the root node
        // Pass an empty StringBuilder, and the initial "smallest" string as a large character to start
        return helper(root, new StringBuilder(), "~");
    }
    
    private String helper(TreeNode node, StringBuilder sb, String smallest) {
        // Base case: if node is null, return the current smallest string
        if (node == null) {
            return smallest;
        }
        
        // Prepend the current character to the string builder
        sb.append((char) ('a' + node.val));
        
        // Check if this is a leaf node
        if (node.left == null && node.right == null) {
            // Reverse the string builder to get the leaf-to-root string
            sb.reverse();
            String leafToRoot = sb.toString();
            // Restore the original string builder
            sb.reverse();
            
            // Compare the current leaf-to-root string with the current smallest string
            if (leafToRoot.compareTo(smallest) < 0) {
                smallest = leafToRoot;
            }
        } else {
            // Recursively call for left and right children
            smallest = helper(node.left, new StringBuilder(sb), smallest);
            smallest = helper(node.right, new StringBuilder(sb), smallest);
        }
        
        // Remove the current character to maintain the state
        sb.setLength(sb.length() - 1);
        
        return smallest;
    }
}
