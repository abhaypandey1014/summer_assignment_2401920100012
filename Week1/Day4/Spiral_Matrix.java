class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int frow = 0;
        int lrow = m-1;
        int fcol = 0;
        int lcol = n-1;
        int count=0;
        int max = m*n;
        while(ans.size()<max)
        {
            //right jao
            for(int j = fcol;j <= lcol;j++){
                ans.add(arr[frow][j]);}
                frow++;
                if(ans.size()==max) break;
            //down jao
            for(int i = frow;i <= lrow;i++) {     
                ans.add(arr[i][lcol]);}
                lcol--;       
            if(ans.size()==max) break;
            //left jao
            for(int j = lcol;j >= fcol;j--){         
                ans.add(arr[lrow][j]);}
                lrow--;          
            if(ans.size()==max) break;
            //up jao
            for(int i = lrow;i >= frow;i--){
                ans.add(arr[i][fcol]);}
                fcol++;
        }
        return ans;
    }
}