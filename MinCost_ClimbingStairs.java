class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for(int j=2;j<cost.length;j++){
            cost[j]+=Math.min(cost[j-1], cost[j-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
   
    }
}
