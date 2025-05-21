class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int temp=0;
        int zerocount=1;
       for(int r=0;r<nums.length;r++){
        if(nums[r]==0){
            zerocount--;
        }
         while (zerocount < 0) {
                if (nums[l] == 0) {
                    zerocount++;
                }
                l++;
            }
            temp = Math.max(temp, r - l);
     }   
       return temp;
    }
}
