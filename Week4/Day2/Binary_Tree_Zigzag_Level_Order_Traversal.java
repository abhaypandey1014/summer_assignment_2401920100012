class Solution {
    static class Pair {
        TreeNode node;
        int level;
        public Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            int level = front.level;
            if(ans.size() == level) ans.add(new ArrayList<>());
            if(level % 2 == 0) ans.get(level).add(front.node.val);
            else ans.get(level).add(0,front.node.val);
            if(front.node.left != null) q.add(new Pair(front.node.left,level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right,level+1));
        }
        return ans;
    }
}