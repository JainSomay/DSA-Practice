class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode node=root;
        Stack<TreeNode> st=new Stack<TreeNode>();
        List<Integer> res=new ArrayList<Integer>();
       
            while(node!=null){
                res.add(node.val);
                
                if(node.right!=null){
                    st.push(node.right);
                }
                node=node.left;
                if(node==null && !st.isEmpty()){
                    node=st.pop();
                }
           
        }
        
        return res;
    }
}
