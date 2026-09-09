class Solution {
    public long countCommas(long n) {
        long count =0;
        long t = 1000;
        while( n >= t){
            count += n - t + 1;
            t *= 1000;
        }
        return count;
    }
}