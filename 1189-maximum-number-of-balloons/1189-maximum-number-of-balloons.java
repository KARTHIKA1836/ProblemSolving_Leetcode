class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[26];
        for (char c : text.toCharArray()) {
            counts[c - 'a']++;
        }
        int maxBalloons = counts['b' - 'a'];          // 'b'
        maxBalloons = Math.min(maxBalloons, counts['a' - 'a']);      // 'a'
        maxBalloons = Math.min(maxBalloons, counts['l' - 'a'] / 2);  // 'l' 2
        maxBalloons = Math.min(maxBalloons, counts['o' - 'a'] / 2);  // 'o' 2
        maxBalloons = Math.min(maxBalloons, counts['n' - 'a']);      // 'n'
        
        return maxBalloons;
    }
}