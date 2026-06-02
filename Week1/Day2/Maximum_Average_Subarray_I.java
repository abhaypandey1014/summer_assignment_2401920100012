class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max = -Double.MAX_VALUE;
        int left = 0;
        int right = 0;
        double sum = 0;
        if(n==1) return (double)nums[0];
        while(right!=n){
            sum += nums[right];
            if(right-left+1==k){
                max = Math.max(max,sum/k);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return max;
    }
}