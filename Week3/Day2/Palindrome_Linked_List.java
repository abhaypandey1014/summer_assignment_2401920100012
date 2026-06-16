class Solution {
    public ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode Rhead = rev(slow);
        slow.next = null;
        slow = head;
        while(Rhead!=null && slow!=null){
            if(Rhead.val!=slow.val) return false;
            Rhead = Rhead.next;
            slow = slow.next;
        }
        return true;
    }
}