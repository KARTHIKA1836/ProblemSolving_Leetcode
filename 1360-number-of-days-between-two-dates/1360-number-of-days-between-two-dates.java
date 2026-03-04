class Solution {

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(totalDays(date1) - totalDays(date2));
    }

    private int totalDays(String date) {

        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int days = day;
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < month - 1; i++) {
            days += monthDays[i];
        }
        if (month > 2 && isLeap(year)) {
            days += 1;
        }
        for (int y = 0; y < year; y++) {
            days += isLeap(y) ? 366 : 365;
        }
        return days;
    }
    private boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}