class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs=0;
        int t=minutesToTest/minutesToDie;
        while(Math.pow(t+1, pigs)<buckets){
            pigs++;
        }
        return pigs;
        
    }
}
