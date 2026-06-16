class Solution {
    public ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = rev(head);
        if(n==1){
            temp = temp.next;
            return rev(temp);
        }
        ListNode temp1 = temp;
        for(int i = 1;i<n-1;i++){
            temp1 = temp1.next;
        }
        temp1.next = temp1.next.next;
        return rev(temp);
    }
}
