class Solution {
    int count = 0;
    int res=Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        kthSmallest(root.left, k);
        count++;
        if(count==k){
            return res=root.val;
        }
        kthSmallest(root.right, k);
        return res;
    }
}
