class Solution {
    public long countSubarrays(int[] nums, int k) {
        int temp=0;
        int maxval=0;
        long count=0;
        int left=0;
        for (int i = 0; i < nums.length; i++) {
            maxval = Math.max(maxval, nums[i]);
        }
        for(int i=0;i<nums.length;i++){
           if(nums[i]==maxval){
            temp++;
           }while(temp>=k){
            count += nums.length - i;
                if (nums[left] == maxval) {
                    temp--;
            }
                left++;
           }
        }
        return count;        
    }
}
