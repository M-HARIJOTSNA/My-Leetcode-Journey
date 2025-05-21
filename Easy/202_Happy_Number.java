class Solution {
    public boolean isHappy(int n) {
        int ans = 0;

        while (n != 1 && n != 4) {  // Known cycle detection condition
            ans = 0;
            int temp = n;  // use a copy for digit processing

            while (temp > 0) {
                int digit = temp % 10;
                ans += digit * digit;
                temp = temp / 10;
            }

            n = ans;
        }
        return n == 1;
    }
}
