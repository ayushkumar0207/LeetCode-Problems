class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = head;
        ListNode end   = null;
        int size =0;
        while(start.next!=null) {
            start = start.next;
            size++;
        }
        size = size -k+1;;
        start = head;
        end = head;
        while(k-->1){
            start = start.next;
            
        }
        while(size-->0){
            end = end.next;
        }
        int swap = start.val;
        start.val = end.val;
        end.val = swap;
        return head;
    }
}