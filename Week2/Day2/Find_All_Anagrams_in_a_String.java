class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        char arr[] = p.toCharArray();
        for(int i = 0;i<arr.length;i++){
            char ch = arr[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int l = 0;
        int r = 0;
        int count = map.size();
        while(r<s.length()){
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0) count--;
            }
            if(r-l+1==p.length()){
                if(count==0) ans.add(l);
                char leftChar = s.charAt(l);
                if(map.containsKey(leftChar)){
                    if(map.get(leftChar) == 0) count++;
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                l++;
            }
            r++;
        }
        return ans;
    }
}