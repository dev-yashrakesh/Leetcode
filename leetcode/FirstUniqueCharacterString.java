package leetcode;

public class FirstUniqueCharacterString {

class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++) {
        	int temp=s.charAt(i);
        	if(s.lastIndexOf(temp)==s.indexOf(temp)) {
        		return i;
        	}
        }
        return -1;
    }
}
	
	public static void main(String[] args) {
		String s="aba";
		int c=s.charAt(1);
		int d=s.indexOf(c);
		int f=s.lastIndexOf(c);
		System.out.println(d+""+f);

	}

}
