class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();    
        char[] arr = new char[n];
        int j = 0;
        int count = 0;
        for(int i = 0;i < n;i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                arr[j]=(char)(s.charAt(i)+32);
                j++;
            }
            else if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                arr[j]=s.charAt(i);
                j++;
            }
            else  count++;
        }
        int i = 0;
        int k = j-1;
        while(i<=k){
            if(arr[i]!=arr[k]) return false;
            else{
                i++;
                k--;
            }
        }
        return true;
    }
}