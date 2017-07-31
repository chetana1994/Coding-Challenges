/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    ListNode sortedMerge(ListNode a,  ListNode b) 
    {
        ListNode result = null;
       
        if (a == null)
            return b;
        if (b == null)
            return a;
 
        if (a.val <= b.val) 
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        } 
        else
        {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
 
    }
 
     ListNode getMiddle( ListNode h) 
    {
        
        if (h == null)
            return h;
         ListNode fastptr = h.next;
         ListNode slowptr = h;
         
        while (fastptr != null)
        {
            fastptr = fastptr.next;
            if(fastptr!=null)
            {
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
    }
	public ListNode sortList(ListNode h) {
        if (h == null || h.next == null)
        {
            return h;
        }
 
        
        ListNode middle = getMiddle(h);
         ListNode nextofmiddle = middle.next;
 
        
        middle.next = null;
 
        ListNode left = sortList(h);
 
        ListNode right = sortList(nextofmiddle);
 
       
         ListNode sortedlist = sortedMerge(left, right);
        return sortedlist;

	    
	}
}
