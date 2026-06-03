class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, 
                                  int[] waterStartTime, int[] waterDuration) {
        int landThenWater = calculateSequence(landStartTime, landDuration, waterStartTime, waterDuration);
        int waterThenLand = calculateSequence(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(landThenWater, waterThenLand);
                                  }
    private int calculateSequence(int[] firstStart, int[] firstDur, int[] secondStart, int[] secondDur) {
        int minFirstEnd = Integer.MAX_VALUE;
        for (int i = 0; i < firstStart.length; i++) {
            minFirstEnd = Math.min(minFirstEnd, firstStart[i] + firstDur[i]);
        }
        int minTotalFinish = Integer.MAX_VALUE;
        for (int j = 0; j < secondStart.length; j++) {
            int currentFinish = Math.max(minFirstEnd, secondStart[j]) + secondDur[j];
            minTotalFinish = Math.min(minTotalFinish, currentFinish);
        }
        return minTotalFinish;
    }
}
