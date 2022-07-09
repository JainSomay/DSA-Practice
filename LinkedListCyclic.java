public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> arr=new ArrayList<>();
        while(head!=null){
            if(arr.contains(head)){
                return true;
            }
            else{
                arr.add(head);
                head=head.next;
            }
        }
        return false;
    }
}
