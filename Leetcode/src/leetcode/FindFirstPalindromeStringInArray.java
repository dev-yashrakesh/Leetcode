package leetcode;

public class FindFirstPalindromeStringInArray {

	
	public static boolean check(String s) {
		int start=0;
		int end=s.length()-1;
		
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			else {
				start++;
				end--;
			}
		}
		return true;
	}
public String firstPalindrome(String[] words) {
	if(words.length==0) {
		return "";
	}
	for(int i=0;i<words.length;i++) {
		if(check(words[i])==true) {
			return words[i];
		}
	}
	return "";
	
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
