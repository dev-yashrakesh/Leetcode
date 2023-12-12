package leetcode;

public class LengthOfLastWord {

	 public static int lengthOfLastWord(String s) {		 
//		 s=s.trim();
//		 int count=0;
//		 for(int i=s.length()-1;i>=0;i--) {
//			 if(s.charAt(i)==' ') {
//				 break;
//			 }
//			
//			 count++;
//			 
//		 }
//		 return count;
		 
		 int count =0;
		 s=s.trim();
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)==' ') {
				 count=0;
			 }
			 else {
				 count++;
			 }
		 }
		 return count;
	    }
	
		 
	public static void main(String[] args) {
		String s="   fly me   to   the moon  ";
		int ans=lengthOfLastWord(s);
		System.out.println(ans);

	}

}
