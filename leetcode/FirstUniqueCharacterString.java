package leetcode;

public class FirstUniqueCharacterString {

public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++) {
        	int count=0;
        	for(int j=0;j<s.length();j++) {
        		if(s.charAt(i)==s.charAt(j)) {
        			count++; 
        		}
        		
        	}
        	if(count==1) {
        		return i;
        	}
        	
        }
        return -1;
    }
	
	public static void main(String[] args) {
		String s="aba";
		int c=s.charAt(1);
		int d=s.indexOf(c);
		int f=s.lastIndexOf(c);
		System.out.println(d+""+f);

	}

}
