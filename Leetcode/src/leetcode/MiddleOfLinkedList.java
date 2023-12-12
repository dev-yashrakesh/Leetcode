package leetcode;

public class MiddleOfLinkedList {

public ListNode middleNode(ListNode head) {
        
	ListNode slow=head,fast=head;
	if(head==null) {
		return head;
	}
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	return slow;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
