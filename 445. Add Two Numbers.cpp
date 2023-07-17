class Solution {
public:

    ListNode* rev(ListNode* head){
        ListNode* prev = NULL;
        while(head){
            ListNode* nxt = head->next;
            head->next = prev;
            prev= head;
            head = nxt;
        }
        return prev;
    }

    ListNode* helper(ListNode* l1, ListNode* l2){
        ListNode* temp1 = new ListNode(0);
        ListNode* tail = temp1;
        int carry = 0;

        while(l1 != NULL || l2 != NULL || carry != 0){
            int digit1 = (l1 == NULL) ? 0 : l1->val;
            int digit2 = (l2 == NULL) ? 0 : l2->val;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode* temp2 = new ListNode(digit);
            tail->next = temp2;
            tail = tail->next;

            l1 = (l1 != NULL) ? l1->next : NULL;
            l2 = (l2 != NULL) ? l2->next : NULL;
        }
        return temp1->next;
    }

    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        l1 = rev(l1);
        l2 = rev(l2);
        ListNode* ans = helper(l1, l2);
        return rev(ans);
    }
};