package leetcode;

public class ReverseInteger {

	 public int reverse(int x) {
		 
		 if(x>2147483647) {
			 return 0;
		 }
	       long reverse=0;
	       while(x!=0) {
	    	   int reminder=x%10;
	    	   reverse=reverse*10+reminder;
	    	   x=x/10;
	       }
	      
	       if(reverse>Integer.MAX_VALUE||reverse<Integer.MIN_VALUE) {
	    	   return 0;
	       }
	       if(x<0) {
	    	   return (int)(-1*reverse);
	       }
	       return (int)(reverse);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
