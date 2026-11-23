class Solution {
    public boolean checkString(String s) {
        boolean seen = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                seen = true;
            }
            if(s.charAt(i)=='a'&& seen){
                return false;
            }
        }
        return true;
    }
}