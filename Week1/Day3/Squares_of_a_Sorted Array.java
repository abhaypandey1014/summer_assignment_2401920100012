class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int left = 0;
        int right = n-1;
        for(int i = n-1;i>=0;i--){
            int l = nums[left];
            int r = nums[right];
            if(Math.abs(l)>Math.abs(r)){
                ans[i] = l*l;
                left++;
            } 
            else{
                ans[i] = r*r;
                right--;
            }
        }
        return ans;        
    }
}