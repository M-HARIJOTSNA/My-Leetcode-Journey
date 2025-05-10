import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // Add all elements from nums1 to a set
        for (int num : nums1) {
            set.add(num);
        }

        // Check for common elements in nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                al.add(num);
                set.remove(num); // Ensure uniqueness in result
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            result[i] = al.get(i);
        }

        return result;
    }
}
