package leetcode;

public class AddDigit {

public static int addDigits(int num) {
        int sum=0;
        
		while(num>0) {
			sum=sum+(num%10);
			num=num/10;
			
			if(sum>9&&num==0) {
	        	num=sum;
	        	sum=0;
	        }
		}
		return sum;
	
    }
	
	public static void main(String[] args) {

	}

}
