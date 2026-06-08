class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Queue <Character> q = q = new LinkedList<>();
        int freq[] = new int[26];
        char ab = '@';
        for(int i = 0;i<n;i++)
        {
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {
                q.remove();
            }    
        }
        if(q.peek() == null) return -1;
        int x = -2;
        for(int i = 0;i<n;i++)
        {
            if(s.charAt(i)==q.peek()) 
            {
                x = i;
                break;
            }
            else x = -1;
        }
        return x;
    }
}
