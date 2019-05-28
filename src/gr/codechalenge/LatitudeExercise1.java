package gr.codechalenge;
public class LatitudeExercise1 {
	/**
	 * @param prices - Prices in time
	 * @return Best profit 
	 * @throws Exception if array has less then two entries 
	 */
	public static int getMaxProfit(int[] prices) throws Exception {
		if (prices.length < 2) {
			throw new Exception("Prices array must contain at least 2 values");
		}
		
		int bestBuy = prices[0];
		int maxProfit = prices[1] - prices[0]; 
		for (int buyIndex = 1; buyIndex < prices.length-1; buyIndex++) {
			if (prices[buyIndex] < bestBuy) {
				bestBuy=prices[buyIndex];
			}
			if ((prices[buyIndex+1] - bestBuy) > maxProfit ) {
				maxProfit =  prices[buyIndex+1] - bestBuy;
			}
		}
		return maxProfit; 
	}
}
