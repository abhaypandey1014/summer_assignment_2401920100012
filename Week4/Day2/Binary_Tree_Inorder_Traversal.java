class Solution {
    public  void res(TreeNode root,List<Integer> ans) 
    {
        if(root == null) return ;
        res(root.left,ans);
        ans.add(root.val);
        res(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        res(root,ans);
        return ans;
    }
}