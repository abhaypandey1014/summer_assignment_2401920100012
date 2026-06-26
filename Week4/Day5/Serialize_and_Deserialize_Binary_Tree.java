public class Serialize_and_Deserialize_Binary_Tree {
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                sb.append("#,");
                continue;
            }
            sb.append(curr.val).append(",");
            q.add(curr.left);
            q.add(curr.right);
        }
        return sb.toString();
    }

    public TreeNode deserialize(String s) {
        if(s.length() == 0) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String arr[] = s.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i = 1;
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(!arr[i].equals("#")){
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;
            if(!arr[i].equals("#")){
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
}
