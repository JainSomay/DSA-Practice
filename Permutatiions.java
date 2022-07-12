class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perm=new ArrayList<List<Integer>>();
        if(nums.length==0){
            return perm;
        }
        getPermutations(nums, 0, new ArrayList<>(), perm);
        return perm;
    }
    
    public static void getPermutations(int[] nums, int start, List<Integer> temPerm, List<List<Integer>> perm){
        if(temPerm.size()==nums.length){
            perm.add(temPerm);
            return;
        }
        for(int i=0;i<=temPerm.size();i++){
            List<Integer> newPerm=new ArrayList<Integer>(temPerm);
            newPerm.add(i, nums[start]);
            getPermutations(nums, start+1, newPerm, perm);
            
        }
    }
}
