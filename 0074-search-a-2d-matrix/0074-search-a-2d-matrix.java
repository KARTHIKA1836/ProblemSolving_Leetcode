class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int c=matrix[0].length-1;
        int r =0;
        while(r<row&&c>=0){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                r=r+1;
            }
            else{
                c=c-1;
            }
        }return false;
    }
}