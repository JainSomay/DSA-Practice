class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        if(nums==null || nums.length==0){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        if(count==0){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    res[0]=i;
                    break;
                }
            }
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]==target){
                    res[1]=i;
                    break;
                }
            }
            return res;
        }
    }
}
