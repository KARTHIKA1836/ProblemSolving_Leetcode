class Solution {
    public int maximumProduct(int[] num) {
        Arrays.sort(num);
        int n=num.length;
        int ans1=num[n-1]*num[n-2]*num[n-3];
        int ans2=num[0]*num[1]*num[n-1];
        return Math.max(ans1,ans2);
    }
}