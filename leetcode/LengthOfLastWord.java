package leetcode;

public class LengthOfLastWord {

	 public static int lengthOfLastWord(String s) {
//	        int count=0;
//	        int n=s.length();
//	        
//	        for(int i=0;i<n;i++) {
//	        	if(s.charAt(n-1)==' ') {
//	        		n=n-1;
//	        	}
//	        	if(s.charAt(i)==' ') {
//	        		count=0;
//	        	}
//	        	else {
//	        		count++;
//	        	}
//	        }
//	        return count;
		 
		 s=s.trim();
		 int count=0;
		 for(int i=s.length()-1;i>=0;i--) {
			 if(s.charAt(i)==' ') {
				 break;
			 }
			
			 count++;
			 
		 }
		 return count;
	    }
	
	public static void main(String[] args) {
		String s="   fly me   to   the moon  ";
		String a=s.trim();
		int ans=lengthOfLastWord(s);
		System.out.println(ans);

	}

}
