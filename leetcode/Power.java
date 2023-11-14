package leetcode;

public class Power {

public double myPow(double x, int n) {
        if(n==0) {
        	return 1;
        }
        if(x==0) {
        	return 0;
        }
        double ans=x*myPow(x,n-1);
        return ans;
    }
	
	public static void main(String[] args) {
		double n=myPow(5,2);
		

	}

}
