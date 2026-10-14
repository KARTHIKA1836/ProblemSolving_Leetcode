class Solution {
    public int minStartValue(int[] nums) {
        int startvalue = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            startvalue=Math.min(startvalue,sum);
        }
        if(startvalue<0){
            return 1-startvalue;
        }
        return 1;
    }
}