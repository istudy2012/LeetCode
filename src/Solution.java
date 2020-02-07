class Solution {
    public int sumNumbers(TreeNode root) {
        return sumTree(0, root);
    }

    private int sumTree(int prefix, TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return prefix + root.val;
        }

        int newPrefix = (prefix + root.val) * 10;
        return sumTree(newPrefix, root.left) + sumTree(newPrefix, root.right);
    }
}