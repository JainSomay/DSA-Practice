class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        comp(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
    
    public void comp(List<List<Integer>> result, List<Integer> cur, int [] candidates, int target, int start){
        if(target==0){
            result.add(new ArrayList<Integer>(cur));
        }
        else if(target>0){
            for(int i=start;i<candidates.length && target>=candidates[i];i++){
                cur.add(candidates[i]);
                comp(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size()-1);
            }
        }
    }
}
