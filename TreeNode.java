public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        String val = "[";
        val += traverseTreeNode(this) + "]";
        return val;
    }

    public String traverseTreeNode(TreeNode node) {
        if (node == null)
            return " null ";
        
        String val = " " + node.val + " " + traverseTreeNode(node.left) + " " + traverseTreeNode(node.right) + " ";

        return val;
    }
} 
