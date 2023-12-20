package leetcode;

public class BestTimeToBuyAndSellStocks {

public static int maxProfit(int[] prices) {
     int profit=0;
     int temp=Integer.MAX_VALUE;
     int pist=0;
     for(int i=0;i<prices.length;i++) {
    	 if(prices[i]<temp) {
    		 temp=prices[i];
    	 }
    	 pist=prices[i]-temp;
    	 if(profit<pist) {
    		 profit=pist;
    	 }
     }
     return profit;
    }
	
	public static void main(String[] args) {
		int arr[]= {7,1,5,3,6,4};
		int ans=maxProfit(arr);
		System.out.println(ans);

	}

}
