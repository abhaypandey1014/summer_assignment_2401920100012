class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        int newR = 0;
        int newC = 0;
        if(n*m != r*c) return mat;
        int[][] res = new int[r][c];
        for(int i = 0;i<n;i++){
            for(int j = 0;j < m;j++){
                res[newR][newC] = mat[i][j];
                newC++;
                if(newC == c){
                    newC=0;
                    newR++;
                }
            }
        }
        return res;
    }
}