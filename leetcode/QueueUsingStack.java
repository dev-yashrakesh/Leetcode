package leetcode;

import java.util.Stack;

//public class QueueUsingStack {
	class MyQueue {
		Stack<Integer> s1;
		Stack<Integer> s2;
		
		
	    public MyQueue() {
	        s1=new Stack<>();
	        s2=new Stack<>();
	    }
	    
	    public void push(int x) {
	        while(!s1.isEmpty()) {
	        	s2.push(s1.peek());
	        	s1.pop();
	        }
	        s2.push(x);
	        while(!s2.isEmpty()) {}
	        s1.push(s2.peek());
	        s2.pop();
	    }
	    
	    public int pop() {
	        int temp=s1.peek();
	        s1.pop();
	        return temp;
	    }
	    
	    public int peek() {
	        return s1.peek();
	    }
	    
	    public boolean empty() {
	        return s1.isEmpty();
	    }
	}
//}
