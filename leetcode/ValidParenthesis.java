package leetcode;

import java.util.Stack;

public class ValidParenthesis {

public boolean isValid(String s) {
        Stack<Character>ans=new Stack<>();
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') {
        		ans.push(s.charAt(i));
        	}
        else if(ans.isEmpty()) {
        		return false;
        	}
        	
        else if(ans.peek()=='('&&s.charAt(i)==')') {
        	ans.pop();
        }
        else if(ans.peek()=='['&&s.charAt(i)==']') {
        	ans.pop();
        }
        else if(ans.peek()=='{'&&s.charAt(i)=='}') {
        	ans.pop();
        }
        else {
        	return false;
        }
        }
        return ans.isEmpty();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
