class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> res = new ArrayList();
        support(root, res);
        return res;
    }
    void support(TreeNode root, List<Integer> l){
        if(root != null){
            support(root.left, l);
            support(root.right, l);
            l.add(root.val);
        }
    }
}