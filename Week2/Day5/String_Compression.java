class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int count = 0;
        int k = 0;
        while(j!=chars.length){
            if(chars[i]==chars[j]){
                chars[k++] = chars[i];
                while(j!=chars.length && chars[i]==chars[j]){
                    j++;
                    count++;
                }
                i = j;
                if(count>1){
                String s = String.valueOf(count);
                char arr[] = s.toCharArray();
                int l = 0;
                while(l!=arr.length){
                    chars[k++] = arr[l++];
                }
                }
                count = 0;
            }
        }
        return k;
    }
}
