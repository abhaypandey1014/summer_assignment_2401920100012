class Solution {
    public void help(List<String> ans,String s,int lo,int mid,int n){
        if(s.length() == n*2){
            ans.add(s);
            return;
        }
        if(lo<n) help(ans,s+"(",lo+1,mid,n);
        if(mid<lo) help(ans,s+")",lo,mid+1,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        help(ans,"",0,0,n);
        return ans;
    }
}