package leetcode;

public class PalindromeNumber {

public static boolean isPalindrome(int x) {
        if(x<0) {
        	return false;
        }
        int reverse=0;
        int temp = x;
        while(x!=0) {
        	int reminder=x%10;
        	reverse=reverse*10+reminder;
        	x=x/10;
        }
        if(temp==reverse) {
        	return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		int x=121;
		boolean ans=isPalindrome(x);
		System.out.println(ans);

	}

}
