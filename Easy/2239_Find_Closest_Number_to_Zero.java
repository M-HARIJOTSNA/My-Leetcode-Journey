class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int abs = Math.abs(nums[i]);
            if (Math.abs(closest) > abs || (Math.abs(closest) == abs && nums[i] > closest)) {
                closest = nums[i];
            }
        }
        return closest;
    }
}
