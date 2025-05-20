public class Solution {
    public int divide(int dividend, int divisor) {
        int INT_MAX = Integer.MAX_VALUE; // 2^31 - 1 = 2147483647
        int INT_MIN = Integer.MIN_VALUE; // -2^31 = -2147483648
        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        return dividend / divisor;
    }
}
