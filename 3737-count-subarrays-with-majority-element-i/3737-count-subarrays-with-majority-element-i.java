class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans=0;
        for(int l=0;l<n;l++){
            int tc=0;
            for(int r=l;r<n;r++){
                if(nums[r]==target){
                    tc++;
                }
                int len=r-l+1;
                if(tc>len/2){
                    ans++;
                }
            }
        }
        return ans;
    }
}