class Solution {
    public int mirrorDistance(int n) {
        if (n < 10) {
            return 0;
        }
        String s = new StringBuilder(Integer.toString(n)).reverse().toString();
        int g = Integer.parseInt(s);
        return Math.abs(n - g);
    }
}