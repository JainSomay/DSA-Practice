class Solution {
    int[] temp=new int[31];
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        else if(temp[n]!=0){
            return temp[n];
        }
        else{
            return temp[n]=fib(n-1) + fib(n-2);
        }
    }
}
