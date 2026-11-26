class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int i = 10;
        boolean alice = true;
        while(n>=i){
            n-=i;
            i--;
            alice = !alice;
        }
        return !alice;
    }
}