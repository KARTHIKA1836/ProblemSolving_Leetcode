class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i =0;i<c.length;i++){
            if(c[i]=='#'){
                res.append(res.toString());
            }
            else if(c[i]=='*'){
                if(res.length()!=0){
                    res.deleteCharAt(res.length()-1);
                }
            }
            else if(c[i]=='%'){
                res.reverse();
            }
            else if(c[i]>='a'&&c[i]<='z'){
                res.append(c[i]);
            }
        }
        return res.toString();
    }
}