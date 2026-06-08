class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int ls=0;
        int rs=sum;
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            rs=rs-nums[i];
            ans[i]=Math.abs(ls-rs);
            ls=ls+nums[i];
        }
        return ans;
    }
}