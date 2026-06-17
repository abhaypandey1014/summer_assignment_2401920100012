class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Stack <Integer> s = new Stack<>();
        int ans[] = new int[n];
        int nxt[] = new int[m];
        for(int i = m-1;i>=0;i--)
        {
            while(!s.isEmpty() && nums2[s.peek()]<=nums2[i])
            {
                s.pop();
            }
            if(s.isEmpty())
                {
                    nxt[i] = -1;
                }
            else
                {
                    nxt[i] = nums2[s.peek()];
                }
            s.push(i); 
        }
        int k = 0;
        int o = 0;
        while(k<n)
        {
            if(nums1[k]==nums2[o])
            {
                ans[k] = nxt[o];
                k++;
                o = 0;
            }
            else 
            {
                o++;
            }
        }
        return ans;
    }
}