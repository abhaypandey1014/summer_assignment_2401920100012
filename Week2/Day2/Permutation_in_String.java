class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int count = s1.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        for(int i = 0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        while(r!=s2.length()){
            char ch = s2.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch)>0) count--;
                map.put(ch,map.getOrDefault(ch,0)-1);
            }
            if(r-l+1>s1.length()){
                char ch1 = s2.charAt(l);
                if(map.containsKey(ch1)){
                if(map.get(ch1)>=0) count++;
                map.put(ch1,map.get(ch1)+1);
                }
                l++;
            }
            r++;
            if(count==0) return true;
        }
        return false;
    }
}