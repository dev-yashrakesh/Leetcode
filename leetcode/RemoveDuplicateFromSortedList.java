package leetcode;

public class RemoveDuplicateFromSortedList {

public ListNode deleteDuplicates(ListNode head) {
    
	
	if(head==null||head.next==null) {
		return head;
	}
	
	ListNode slow=head;
	ListNode fast=head.next;
	
	while(fast!=null) {
		if(slow.val==fast.val) {
			slow.next=fast.next;
		}
		else {
			slow=slow.next;
		}
		fast=fast.next;
	}
	
	
	return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
