package leetcode;

public class StringToIntAtoi {

	 public static int myAtoi(String s) {
	        
		 if(s.length()<1) {
			 return 0;
		 }
		 if(s.charAt(0)=='-') {
			 int ans=s.charAt(s.length()-1)-'0';
			 int smallAns=myAtoi(s.substring(1, s.length()-1));
			 return (-1)*(ans+smallAns);
		 }
		 int ans=s.charAt(s.length()-1)-'0';
		 int smallAns=10*myAtoi(s.substring(0, s.length()-1));
		 return ans+smallAns;
	    }
	
	public static void main(String[] args) {
		String s="-123";
		System.out.println(myAtoi(s));

	}

}
