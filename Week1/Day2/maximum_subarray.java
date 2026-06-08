class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(m2<arr[i]) m2 = arr[i];
        }
        if(m2 < 0) return m2;
        for(int i = 0;i<n;i++)
        {
            curr = curr + arr[i];
            if(curr < 0) curr = 0;
            max = Math.max(max,curr);
        }
        return max;
    }
}