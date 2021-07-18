package tree;

import model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class InAndPostBuildTree {

    private Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTree(inorder, 0, postorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int[] postorder, int postStart, int len) {
        if (len == 0) {
            return null;
        }

        int rootVal = postorder[postStart + len - 1];
        if (len == 1) {
            return new TreeNode(rootVal);
        }

        TreeNode root = new TreeNode(rootVal);

        // [9,3,15,20,7]
        // [9,15,7,20,3]
        int index = indexMap.get(rootVal);
        int leftLen = index - inStart;
        root.left = buildTree(inorder, inStart, postorder, postStart, leftLen);
        root.right = buildTree(inorder, index + 1, postorder, postStart + leftLen, len - leftLen - 1);

        return root;
    }
}
