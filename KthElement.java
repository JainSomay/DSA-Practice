class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>(k+1);
        for(int i : nums){
            q.add(i);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.poll();
    }
}
