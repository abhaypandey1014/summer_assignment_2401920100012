class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        int n = s.length();
        int len = 0;
        while(right!=n){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==1){
                len = right-left+1;
            }
            else{
                while(map.get(ch)>1){
                    max = Math.max(len,max);
                    char c = s.charAt(left);
                    map.put(c,map.getOrDefault(c,0)-1);
                    left++;
                }
            }
            right++;
        }
        return max = Math.max(len,max);
    }
}