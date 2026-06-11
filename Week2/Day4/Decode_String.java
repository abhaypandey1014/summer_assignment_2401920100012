class Solution {
    public int help(String s,int idx,StringBuilder sb){
        while(idx<s.length() && s.charAt(idx)!=']'){
            if(Character.isDigit(s.charAt(idx))){
                int num = 0;
                while(Character.isDigit(s.charAt(idx))){
                    num = num*10 + (s.charAt(idx)-'0');
                    idx++;
                }
                idx++; 
                StringBuilder temp = new StringBuilder();
                idx = help(s, idx, temp);
                while(num-->0){
                    sb.append(temp);
                }
                idx++;
            }
            else{
                sb.append(s.charAt(idx));
                idx++;
            }
        }
        return idx;
    }
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        help(s,0,sb);
        return sb.toString();
    }
}