class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()==1) return false;
        for(int i = 0;i<=s.length()/2;i++){
            String sub = s.substring(0,i+1);
            if(sub.length()==s.length()) return false;
            int len = sub.length();
            if(s.length()%len==0){
                int count = s.length()/len;
                while(count--!=1){
                    sub += s.substring(0,i+1);
                }
                if(sub.equals(s)) return true;
            }
        }
        return false;
    }
}