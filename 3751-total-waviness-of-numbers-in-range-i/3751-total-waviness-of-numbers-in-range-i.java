class Solution {
    public int totalWaviness(int num1, int num2) {
        int res=0;
        String s="";
        for(int i=num1;i<=num2;i++){
            s=String.valueOf(i);
            int n= s.length();
            if(n<3){
                continue;
            }
            for(int j=1;j<n-1;j++){
                if(s.charAt(j)>s.charAt(j-1)&&s.charAt(j)>s.charAt(j+1)){
                    res++;
                }
                else if(s.charAt(j)<s.charAt(j-1)&&s.charAt(j)<s.charAt(j+1)){
                    res++;
                }
            }
        }
        return res;
    }
}