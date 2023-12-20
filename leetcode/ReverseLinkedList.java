package leetcode;

public class ReverseLinkedList {

public ListNode reverseList(ListNode head) {
	ListNode curr=head;
	ListNode prev=null;
	ListNode temp;
	
	while(curr!=null) {
		temp=curr.next;
		curr.next=prev;
		prev=curr;
		curr=temp;
	}
        return prev;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
