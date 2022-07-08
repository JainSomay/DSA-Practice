class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode rev=null;
        while(head!=null){
            ListNode cur=head;
            head=head.next;
            cur.next=rev;
            rev=cur;
        }
        return rev;
    }
}
