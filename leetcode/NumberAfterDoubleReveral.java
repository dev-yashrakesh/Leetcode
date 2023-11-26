package leetcode;

public class NumberAfterDoubleReveral {

public static int reverse(int num) {
	int reverse =0;
	while(num>0) {

	int reminder=num%10;
	 reverse=10*reverse+reminder;
	 num=num/10;
	 }
	return reverse;
}	
	
public boolean isSameAfterReversals(int num) {
        int check=reverse(num);
        int ans=reverse(check);
        if(ans==num) {
        	return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		int num=0;
		System.out.println(reverse(num));

	}

}
