class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<20;i++){
            if(n==(int)Math.pow(3,i)){
                return true;
            }
        }
        return false;
    }
}
