package leetcode;

import java.util.Arrays;

public class AssignCookies {

public static int findContentChildren(int[] g, int[] s) {
	
	Arrays.sort(g);
	Arrays.sort(s);
        int a=0;
        int b=0;
        while(a<g.length&&b<s.length) {
        	if(g[a]<=s[b]) {
        		a++;
        		b++;
        	}
        	else {
        		b++;
        	}
        }
      
        return a;
    }
	
	public static void main(String[] args) {
		int g[]= {2,2,3};
		int s[]= {1,1};
		int ans=findContentChildren(g,s);
		System.out.println(ans);

	}

}
