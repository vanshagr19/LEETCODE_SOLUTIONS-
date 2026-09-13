class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        
        if (head == nullptr) return nullptr;
        
        
        if (head->next == nullptr) {
            
            return nullptr;
        }

        ListNode* slow = head;
        ListNode* fast = head;
        ListNode* ptr = nullptr;

        while (fast != nullptr && fast->next != nullptr) {
            ptr = slow;
            slow = slow->next;
            fast = fast->next->next;
        }   

        ptr->next = slow->next;
        slow->next = nullptr;
        

        return head;
    }
};