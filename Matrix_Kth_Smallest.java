class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        while(low<=high){
            int mid=(low+high)/2;
            int count=count(matrix, mid);
            if(count<k){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return low;
    }
    int count(int[][] matrix, int val){
        int res=0;
        int n=matrix.length;
        int i=n-1;
        int j=0;
        while(i>=0 && j<n){
            if(matrix[i][j]>val){
                i--;
            }
            else{
                res+=i+1;
                j++;
            }
        }
        return res;
    }
}
