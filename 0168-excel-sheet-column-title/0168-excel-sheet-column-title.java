class Solution {
    public String convertToTitle(int n) {

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            n--; 
            char ch = (char) ('A' + (n % 26));
            result.append(ch);
            n = n / 26;
        }

        return result.reverse().toString();
    }
}
