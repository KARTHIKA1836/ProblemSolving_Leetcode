class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int ac_sum = (len * (len+1))/2;
        for(int i=0;i<len;i++){
            sum=sum+nums[i];
        }
        return ac_sum-sum;
    }
}