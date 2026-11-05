class Solution {
    public int digitFrequencyScore(int n) {
        int[] fre = new int[10];
        while(n>0){
            int digi = n%10;
            fre[digi]+=1;
            n=n/10;
        }
        int sum = 0;
        for(int i=0;i<10;i++){
            sum = sum + (i*fre[i]);
        }
        return sum;
    }
}