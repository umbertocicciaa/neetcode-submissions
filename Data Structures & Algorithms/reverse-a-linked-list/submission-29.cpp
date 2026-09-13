/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution 
{
private:
   ListNode* reverse(ListNode* head, ListNode* prev)
   {
        if (!head)
        {
            return prev;
        }
        ListNode* temp = head->next;
        head->next = prev;
        return reverse(temp, head);
   }
public:
    ListNode* reverseList(ListNode* head) 
    {
        ListNode* prev = nullptr;
        return this->reverse(head, prev);
    }
};
