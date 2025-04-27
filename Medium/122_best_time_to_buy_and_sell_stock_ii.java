class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
		
		int n=prices.length;
        if (n < 2) return 0; 
		int buy=prices[0];
		for(int days=1;days<n;days++) {
			if (prices[days] > prices[days - 1]) {
                profit += prices[days] - prices[days - 1];
            }
		}
        return profit;
        
    }
}
