class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count=0;
        int l=0;
    long temp=0;
        
        for(int r=0;r<nums.length;r++){
              temp+=nums[r];
             while(temp*(r-l+1)>=k){
                    temp-=nums[l];
                     l++;
                     }
                count+=(r-l+1);
                }
    
      return count;  
    }
}
