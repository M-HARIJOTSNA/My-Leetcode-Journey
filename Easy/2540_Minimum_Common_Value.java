class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> hs=new HashSet<>();
        int ans=Integer.MAX_VALUE;
        for(int key:nums1){
         hs.add(key);
        }for(int key:nums2){
            if(hs.contains(key)){
            ans=Math.min(ans,key);
            }
            }
             return ans == Integer.MAX_VALUE ? -1 : ans;
          }
    }
