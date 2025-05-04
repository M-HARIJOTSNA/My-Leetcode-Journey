class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<=15;i++){
            if(n==(int)Math.pow(4,i)){
                return true;
            }
        }
        return false;
    }
}
