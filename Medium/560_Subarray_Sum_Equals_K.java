class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();        
       int temp=0;
        int count=0;
        hm.put(0,1);
        for(int r=0;r<nums.length;r++){
            temp+=nums[r];
            if(hm.containsKey(temp-k)){
                count+=hm.get(temp-k);
                }
                hm.put(temp, hm.getOrDefault(temp,0)+1);
            }
        return count;
    }
}
