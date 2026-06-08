class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int max = 0;
        int area = 0;
        while(j>i){
            if(nums[i]>=nums[j]){
                area = nums[j]*(j-i);
                max = Math.max(max,area);
                j--;
            }
            else{
                area = nums[i]*(j-i);
                max = Math.max(max,area);
                i++;
            }
        }
        return max;
    }
}