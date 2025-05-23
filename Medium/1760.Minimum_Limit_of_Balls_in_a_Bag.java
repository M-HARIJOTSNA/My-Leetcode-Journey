class Solution {
    public boolean ispossible(int[]nums, int maxOperations, int k){
        for(int i=0;i<nums.length;i++){
            int temp = (nums[i] - 1) / k;
             maxOperations-=temp;
        }
        if(maxOperations<0){
            return false;
        }
    return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(nums,maxOperations,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
      return l;
    }
}
