class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        if(n!=1){
        while(j!=n){
            if(nums[i]==nums[j] && nums[i]==0) j++;
            else if(nums[i]==0 && nums[j]!=0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
        }
    }
}