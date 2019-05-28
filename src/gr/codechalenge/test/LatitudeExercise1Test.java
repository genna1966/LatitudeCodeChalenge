package gr.codechalenge.test;
import static org.junit.Assert.*;
import gr.codechalenge.LatitudeExercise1;

import org.junit.Test;

public class LatitudeExercise1Test {

	@Test
	// As per exercise example
	public void testMain() throws Exception {
		int[] prices = { 10, 7, 5, 8, 11, 9 };
		int result = LatitudeExercise1.getMaxProfit(prices);
		assertEquals(6, result);
	}

	@Test
	// Array must have at least two elements
	public void testShortArray() throws Exception {
		int[] prices = { 5 };
		try {
			LatitudeExercise1.getMaxProfit(prices);
			fail("Must throw Exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	// Must handle sliding prices - show least damaging trade
	public void testSlidingPrices() throws Exception {
		int[] prices = { 10, 8, 5, 4, 2, 1 };
		int result = LatitudeExercise1.getMaxProfit(prices);
		assertEquals(-1, result);
	}

	@Test
	// Handle Peak and Trough - buying at min price does not give best profit
	public void testPeakAndTrough() throws Exception {

		int[] prices = { 6, 7, 8, 9, 10, 6, 4, 1, 3 };
		int result = LatitudeExercise1.getMaxProfit(prices);
		assertEquals(4, result);
	}

}
