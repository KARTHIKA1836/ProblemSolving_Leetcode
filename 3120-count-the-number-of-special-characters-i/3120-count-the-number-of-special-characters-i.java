class Solution {
    public int numberOfSpecialChars(String word) {
        int res = 0;
        Set<Character> ch =new HashSet<>();
        for(char c : word.toCharArray()){
            ch.add(c);
        }
        for(char c = 'a'; c <= 'z'; c++){
            if(ch.contains(c)&&ch.contains(Character.toUpperCase(c))){
                res++;
            }
        }
        return res;
    }
}