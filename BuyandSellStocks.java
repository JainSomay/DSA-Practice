class Solution {
    public int maxProfit(int[] prices) {
        int b=prices[0];
        int pro=0;
        for(int i=0;i<prices.length;i++){
            if(b<prices[i]){
                pro=Math.max(prices[i]-b, pro);
            }
            else{
                b=prices[i];
            }
        }
        return pro;
    }
}
