public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkSymmetry(root, root);
    }
    public boolean checkSymmetry(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        
        if (left != null && right != null && left.val == right.val) {
            boolean bool1 = checkSymmetry(left.left, right.right);
            boolean bool2 = checkSymmetry(left.right, right.left);
            return bool1 && bool2;
        }
        return false;
    }
} 
