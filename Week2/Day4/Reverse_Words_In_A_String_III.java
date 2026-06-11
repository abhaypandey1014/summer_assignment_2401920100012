class Solution {
    public void helper(String[] ans,String[] words,int idx){
        if(idx==words.length) return;
        ans[idx] = reverse(words[idx]);
        helper(ans,words,idx+1);
        return;
    }
    public String reverse(String s){
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return new String(arr);
    }
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        String ans[] = new String[words.length];
        helper(ans,words,0);
        String res = String.join(" ", ans);
        return res;
    }
}