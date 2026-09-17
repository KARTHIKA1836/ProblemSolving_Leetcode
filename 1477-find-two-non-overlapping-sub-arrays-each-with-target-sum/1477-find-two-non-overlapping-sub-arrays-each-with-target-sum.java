class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = Integer.MAX_VALUE / 2; 
        
        int minTotalLength = INF;
        int currentSum = 0;
        int left = 0; 
        
        int[] bestLengthsHistory = new int[n];
        int bestLeftLength = INF; 
        
        for (int r = 0; r < n; r++) {
            currentSum += arr[r];
            
            while (currentSum > target) {
                currentSum -= arr[left];
                left++;
            }
            
            if (currentSum == target) {
                int currentLen = r - left + 1;
                
                if (left > 0 && bestLengthsHistory[left - 1] != INF) {
                    int combinedLen = currentLen + bestLengthsHistory[left - 1];
                    minTotalLength = Math.min(minTotalLength, combinedLen);
                }
                
                bestLeftLength = Math.min(bestLeftLength, currentLen);
            }
            
            bestLengthsHistory[r] = bestLeftLength;
        }
        
        return minTotalLength >= INF ? -1 : minTotalLength;
    }
}
