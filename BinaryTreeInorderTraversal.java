class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        support(root, res);
        return res;
    }
    void support(TreeNode root, List<Integer> l){
        if(root != null){
            support(root.left, l);
            l.add(root.val);
            support(root.right, l);
        }
    }
}