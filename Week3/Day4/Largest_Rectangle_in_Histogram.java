class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int nsl[] = new int[n];
        for(int i = 0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()) nsl[i] = -1;
            else nsl[i] = s.peek();
            s.push(i); 
        }
        int nsr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int j = n-1;j>=0;j--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[j]){
                st.pop();
            }
            if(st.isEmpty()) nsr[j] = n;
            else nsr[j] = st.peek();
            st.push(j); 
        }
        int curr = 0;
        for(int k = 0;k<n;k++){
            int max = arr[k]*(nsr[k]-nsl[k]-1);
            curr = Math.max(max,curr);
        }
        return curr;
    }
}