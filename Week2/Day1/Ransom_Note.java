class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        char arr[] = magazine.toCharArray();
        char brr[] = ransomNote.toCharArray();
        for(int i = 0;i<arr.length;i++){
            char ch = arr[i];
            freq[ch-'a']++;
        }
        for(int i = 0;i<brr.length;i++){
            char ch = brr[i];
            int val = ch -'a';
            if(freq[val] <= 0) return false;
            freq[val]--;
        }
        return true;
    }
}