class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==target){
                    count++;
                }
             
            }
        }
        if(count>0){
            return true;
        }
        else
            return false;
        
    }
    
}
