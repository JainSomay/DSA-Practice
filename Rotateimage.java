class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(i==j)
                    continue;
                else
                    swap(matrix, i, j);
            }
        }
        for(int i=0;i<n/2;i++){
            swap1(matrix, i, n-i-1, n);
        }
    }
    private void swap(int [][] ar, int i, int j){
        int tmp=ar[i][j];
        ar[i][j]=ar[j][i];
        ar[j][i]=tmp;
    }
    private void swap1(int [][] ar, int i, int j, int n){
        for(int in=0;in<n;in++){
            int tmp=ar[in][i];
            ar[in][i]=ar[in][j];
            ar[in][j]=tmp;
        }
    }
}
