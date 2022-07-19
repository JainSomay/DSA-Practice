class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node=root;
        List<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> st=new Stack<TreeNode>();
        while(node!=null || !st.isEmpty()){
            while(node!=null){
                st.add(node);
                node=node.left;
            }
            node=st.pop();
            res.add(node.val);
            node=node.right;
        }
        return res;
    }
}
