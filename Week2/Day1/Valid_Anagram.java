class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m!=n) return false;
        char[] arr = s.toCharArray();
        char[] brr = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++)
        {
         if(arr[i]!=brr[i]) return false;
        }
        return true;
    }
}