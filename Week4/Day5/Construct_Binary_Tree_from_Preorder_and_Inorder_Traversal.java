class Solution {
    public TreeNode build(int prelo,int prehi,int[] pre,int inlo,int inhi, int[] in)
    {
        if(prelo>prehi)return null;
        int root = pre[prelo];
        TreeNode res = new TreeNode(root);
        int r = 0;
        for(int i = inlo;i<=inhi;i++)
        {
            if(in[i]==root) {
                r = i;
                break;
            }
        }
        int cnt = r-inlo;
        res.left = build(prelo+1,prelo+cnt,pre,inlo,r-1,in);
        res.right = build(prelo+cnt+1,prehi,pre,r+1,inhi,in);
        return res;
    }
    public TreeNode buildTree(int[] pre, int[] in) {
        int n = in.length;
        TreeNode ans = build(0,n-1,pre,0,n-1,in);
        return ans;
    }
}