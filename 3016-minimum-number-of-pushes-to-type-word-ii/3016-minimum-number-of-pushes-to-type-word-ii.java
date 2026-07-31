class Solution {
    public int minimumPushes(String word) {
        int[] counts = new int[26];
        for (char c : word.toCharArray()) {
            counts[c - 'a']++;
        }
        Arrays.sort(counts);
        int totalPushes = 0;
        for (int i = 0; i < 26; i++) {
            int freq = counts[25 - i]; 
            if (freq == 0) break;      
            int pressMultiplier = (i / 8) + 1;
            totalPushes += freq * pressMultiplier;
        }
        return totalPushes;
    }
}