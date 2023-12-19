package leetcode;

public class ClimbingStairs {

public int climbStairs(int n) {
        if(n<=2) {
        	return n;
        }
        
        int first=1;
        int second=2;
        for(int i=2;i<n;i++) {
        	int c=first+second;
        	first=second;
        	second=c;
        }
        return second;
    }
	
	public static void main(String[] args) {
		

	}

}
