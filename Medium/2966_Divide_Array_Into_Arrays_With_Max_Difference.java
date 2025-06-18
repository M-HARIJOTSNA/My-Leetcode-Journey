class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length/3;
        int res[][]=new int[n][3];
       int index=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3){
            int min=nums[i];
            int mid=nums[i+1];
            int max=nums[i+2];
            if(max-min>k) return new int[0][0];
            res[index++]=new int[]{min,mid,max};
        }
       return res;
        
    }
}
