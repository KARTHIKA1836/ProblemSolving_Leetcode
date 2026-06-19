class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int max=0;
        for(int g : gain){
            res=res+g;
            max=Math.max(max,res);
        }
        return max;
    }
}