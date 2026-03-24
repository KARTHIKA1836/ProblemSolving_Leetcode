class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod=12345;
        int[][] ans = new int[m][n];
        int pre=1,suf=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=pre;
                pre=(pre*(grid[i][j]%mod))%mod;
            }
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                ans[i][j]=(ans[i][j]*suf)%mod;
                suf=(suf*(grid[i][j]%mod))%mod;
            }
        }
        return ans;
    }
}