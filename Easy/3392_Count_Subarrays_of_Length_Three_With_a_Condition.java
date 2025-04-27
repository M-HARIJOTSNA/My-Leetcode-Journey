class Solution {
    public int countSubarrays(int[] nums) {
        int k=3;
        int l=0;
        int temp=0;
        int edge;
        int count =0;
        for(int r=0;r<nums.length;r++){
            temp+=nums[r];
            if(r-l+1>k){
                temp-=nums[l];
                l++;
            }
            if(r-l+1==k){
         edge=(nums[l]+nums[r])*2;

            if( r - 1 >= l && edge==nums[r-1]){
                count++;
            }
         }
      }
        return count;
      }
}
