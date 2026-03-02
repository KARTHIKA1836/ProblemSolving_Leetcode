class Solution {
    public String toHex(int num) {
        
        if(num == 0) return "0";
        
        char[] map = {'0','1','2','3','4','5','6','7',
                      '8','9','a','b','c','d','e','f'};
        
        long n = num;
        
        // Handle negative numbers manually
        if(n < 0) {
            n = n + 4294967296L;  // 2^32
        }
        
        String result = "";
        
        while(n > 0) {
            int remainder = (int)(n % 16);
            result = map[remainder] + result;
            n = n / 16;
        }
        
        return result;
    }
}