class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] combined=new int[nums1.length+nums2.length];
         System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
