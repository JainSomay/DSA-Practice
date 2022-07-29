class Solution {
    public int rob(int[] nums) {
        int res1=0;
        int res2=0;
        for(int i:nums){
            int temp=res1;
            res1=Math.max(res1, res2);
            res2=i+temp;
        }
        return Math.max(res1, res2);
    }
}
