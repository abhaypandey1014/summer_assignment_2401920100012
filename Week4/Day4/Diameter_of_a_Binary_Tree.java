class Solution {
    public int height(TreeNode root){
        if(root==null)  return 0;
        int left =  height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int leftdia = diameterOfBinaryTree(root.left);
        int rightdia = diameterOfBinaryTree(root.right);
        int lefth = height(root.left);
        int righth = height(root.right);
        int selfdia = righth+lefth;
        return Math.max(selfdia,Math.max(leftdia,rightdia));
    }
}