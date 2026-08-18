class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
       
        if(k==n){
             int max = -1;
            for(int i=0;i<n;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            return max;
        }
        Map<Integer,Integer> count = new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        if(k==1){
            int max=-1;
            for(Map.Entry<Integer,Integer> e:count.entrySet()){
                if(e.getValue()==1){
                    max=Math.max(max,e.getKey());
                }
            }
            return max;
        }
        int ans=-1;
        int f=nums[0];
        int l= nums[n-1];
        if(count.get(f)==1){
            ans= Math.max(ans,f);
        }
        if(count.get(l)==1){
            ans=Math.max(ans,l);
        }
        return ans;
    }
}