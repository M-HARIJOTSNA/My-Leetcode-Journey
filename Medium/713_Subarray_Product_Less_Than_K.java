class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int temp=1;
        int count=0;
        for(int r=0;r<nums.length;r++){
            temp*=nums[r];
            while(temp>=k &&l<=r){
                temp/=nums[l];
                l++;
            }
            count+=(r-l+1);
        }
        return count;
      }
}
