class Solution {
    public double angleClock(int hour, int minutes) {
        int h12 = hour % 12;
        double angle = Math.abs((30 * h12) - (5.5 * minutes));
        return Math.min(angle, 360.0 - angle);
    }
}