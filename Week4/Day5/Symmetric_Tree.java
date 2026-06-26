class Solution {
    private void mirror(TreeNode root)
    {
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    private boolean issame(TreeNode Rnew, TreeNode Lnew)
    {   
        if(Rnew == null && Lnew == null) return true;
        if(Rnew == null || Lnew == null) return false;
        if(Rnew.val != Lnew.val) return false;
        return issame(Rnew.left,Lnew.left) && issame(Rnew.right,Lnew.right);
    }
    public boolean isSymmetric(TreeNode root) {
        
        mirror(root.left);
        if(issame(root.left,root.right)) return true;
        else return false;
    }
}