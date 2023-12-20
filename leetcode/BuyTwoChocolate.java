package leetcode;

import java.util.Arrays;

public class BuyTwoChocolate {

public int buyChoco(int[] prices, int money) {
        
	Arrays.sort(prices);
	
	int total=prices[0]+prices[1];
	if(total<=money) {
		return money-total;
	}
	else {
		return money;
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
