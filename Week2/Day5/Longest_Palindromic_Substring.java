class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0;i<s.length();i++){
            String s1 = "";
            int gol = 0;
            s1 += s.charAt(i);
            while((i+gol)<s.length()&&(i-gol)>=0){
                if(s.charAt(i+gol)==s.charAt(i-gol)){
                    char ch = s.charAt(i-gol);
                    if(gol!=0) s1 = ch + s1 + ch;
                }
                else break;
                gol++;
            }
            if((s1.length()>ans.length())) ans = s1;
        }
        for(double i = 0.5;i<s.length();i++){
            String s1 = "";
            double gol = 0.5;
            while((int)(i+gol)<s.length()&&(int)(i-gol)>=0){
                if(s.charAt((int)(i+gol))==s.charAt((int)(i-gol))){
                    char ch = s.charAt((int)(i-gol));
                    if(gol!=0) s1 = ch + s1 + ch;
                }
                else break;
                gol++;
            }
            if((s1.length()>ans.length())) ans = s1;
        }
        return ans;
    }
}
