package leetcode;

public class RichestCustomerWealth {

	 public static int maximumWealth(int[][] accounts) {
	        int temp=0;
	        for(int i=0;i<accounts.length;i++) {
	        	int sum=0;
	        	for(int j=0;j<accounts[i].length;j++) {
	        		sum=sum+accounts[i][j];
	        	}
	        	if(sum>temp) {
	        		temp=sum;
	        	}

	        }
	        return temp;
	    }
	
	public static void main(String[] args) {
		
	}

}
