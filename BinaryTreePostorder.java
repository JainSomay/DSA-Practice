class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res=new LinkedList<Integer>();
        
        Stack<TreeNode> st=new Stack<TreeNode>();
        if (root == null) return res;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            res.addFirst(node.val);
            if(node.left!=null){
                st.push(node.left);
            }
            if(node.right!=null){
                st.push(node.right);
            }
        }
        return res;
        
    }
}
