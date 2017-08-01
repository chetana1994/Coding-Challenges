/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    
	    ListNode slow=a;
	    ListNode fast=a;
	   // int cycle;
	    while(slow!= null && fast!=null && fast.next!=null)
	    {
	        slow=slow.next;
	        fast=fast.next.next;
	        if(fast==slow)
	            return slow;
	           
	    }
	    
	    return null;
	    
	    
	}
}
