package leetcode;

public class PercentageLetter {
public int percentageLetter(String s, char letter) {
    int count=0;
    int n=s.length();
    for(int i=0;i<s.length();i++) {
    	if(s.charAt(i)==letter) {
    		count++;
    	}
    	
    	
    }
    int ans=(100*count)/n;
    return ans;
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
