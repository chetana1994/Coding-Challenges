**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
 //Recursively reversing a linked list
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
     if(head==NULL || head->next==NULL)
            return head;
        ListNode *nextNode=head->next;
        ListNode *newhead=reverseList(nextNode);
        nextNode->next=head;
        head->next=NULL;
        return newhead;
     
        
    }
        
    };
