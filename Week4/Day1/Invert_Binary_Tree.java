class Solution {
    public void help(TreeNode node){
        if(node==null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        help(node.left);
        help(node.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        help(root);
        return root;
}
}