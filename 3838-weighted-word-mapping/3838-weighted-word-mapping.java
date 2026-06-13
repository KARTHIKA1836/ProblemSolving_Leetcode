class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();
        for(String word : words){
            int sumWeight = 0;
            for(char ch : word.toCharArray()){
                sumWeight += weights[ch-'a'];
            }
            int value = sumWeight % 26;
            res.append((char)('z'-value));
        }
        return res.toString();
    }
}