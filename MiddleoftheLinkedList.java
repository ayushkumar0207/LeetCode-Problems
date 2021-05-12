class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int x = size/2;
        temp = head;
        for(int i=0; i<x; i++)
            temp = temp.next;
        return temp;
    }
}