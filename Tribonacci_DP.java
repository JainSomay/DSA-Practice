class Solution {
    int[] temp=new int[100];
    public int tribonacci(int n) {
        if(n<=1){
            return n;
        }
        else if(n==2){
            return 1;
        }
        else if(temp[n]!=0){
            return temp[n];
        }
        else{
            return temp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        }
    }
}
