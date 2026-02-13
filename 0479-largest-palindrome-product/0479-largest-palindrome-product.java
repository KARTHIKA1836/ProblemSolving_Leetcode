class Solution {
    public int largestPalindrome(int n) {

        if (n == 1) return 9;

        int upper = (int)Math.pow(10, n) - 1;
        int lower = (int)Math.pow(10, n - 1);

        for (int left = upper; left >= lower; left--) {
            String s = String.valueOf(left);
            String rev = new StringBuilder(s).reverse().toString();
            long pal = Long.parseLong(s + rev);
            for (long i = upper; i * i >= pal; i--) {
                if (pal % i == 0) {
                    long other = pal / i;
                    if (other >= lower && other <= upper) {
                        return (int)(pal % 1337);
                    }
                }
            }
        }

        return 0;
    }
}
