class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList();
        support(root, res);
        return res;
    }
    void support(TreeNode root, List<Integer> l){
        if(root != null){
            l.add(root.val);
            support(root.left, l);
            support(root.right, l);
        }
    }
}