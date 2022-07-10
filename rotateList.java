class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode s=head;
        ListNode f=head;
        if(head==null || head.next==null){
            return head;
        }
        
        int size=1;
        while(f.next!=null){
            f=f.next;
            size++;
        }
        k=k%size;
        for(int i=0;i<size-k-1;i++){
            s=s.next;
        }
        f.next=head;
        head=s.next;
        s.next=null;
        return head;
    }
}
