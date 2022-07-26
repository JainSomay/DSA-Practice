class Solution {
    public int climbStairs(int n) {
        int [] temp=new int[100];
        if(n==1 || n==2 || n==3){
            return n;
        }
        
            temp[1]=1;
            temp[2]=2;
            for(int i=3;i<=n;i++){
                temp[i]=temp[i-1]+temp[i-2];
            }
            return temp[n];
        }
}
