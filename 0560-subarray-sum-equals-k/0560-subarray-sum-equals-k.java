class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);
        
        int currentSum = 0;
        int totalSubarrays = 0;
        
        for (int num : nums) {
            currentSum += num;
            if (prefixSums.containsKey(currentSum - k)) {
                totalSubarrays += prefixSums.get(currentSum - k);
            }
            prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) + 1);
        }
        return totalSubarrays;
    }
}
