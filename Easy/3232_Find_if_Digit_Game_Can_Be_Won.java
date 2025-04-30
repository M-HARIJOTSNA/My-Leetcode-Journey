class Solution {
    public boolean canAliceWin(int[] nums) {
        int double1=0;
        int single=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
            if(nums[i]<10){
                single+=nums[i]; 
            }else{
                double1+=nums[i];
            }
        } 
        return single > totalsum - single || double1 > totalsum - double1;
    }
}
