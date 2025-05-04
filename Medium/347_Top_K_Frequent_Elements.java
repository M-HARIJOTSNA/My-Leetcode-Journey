class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
            
        } List<Integer> list = new ArrayList<>(hm.keySet());
        list.sort((a, b) -> hm.get(b) - hm.get(a));

        int[] temparr = new int[k];
        for (int i = 0; i < k; i++) {
            temparr[i] = list.get(i);
        }

        return temparr;
    }
}
