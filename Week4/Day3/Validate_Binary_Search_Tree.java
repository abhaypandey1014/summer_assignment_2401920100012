class Solution {
    private boolean isValidBSt(TreeNode root,TreeNode min,TreeNode max)
        {
            if(root == null) return true;
            if(min != null && min.val >= root.val) return false;
            else if(max != null && max.val <= root.val) return false;
            return isValidBSt(root.left,min,root) && isValidBSt(root.right,root,max);
        }    
    public boolean isValidBST(TreeNode root) {
        TreeNode min = null;
        TreeNode max = null;
        if(isValidBSt(root,min,max)) return true;
        else return false;
    }
}