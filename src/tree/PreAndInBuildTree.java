package tree;

import model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PreAndInBuildTree {

    private Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTree(preorder, 0, inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int[] inorder, int inStart, int len) {
        if (len == 0) {
            return null;
        }

        if (len == 1) {
            return new TreeNode(preorder[preStart]);
        }

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int index = indexMap.get(rootVal);
        int leftLen = index - inStart;
        root.left = buildTree(preorder, preStart + 1, inorder, inStart, leftLen);
        root.right = buildTree(preorder, preStart + leftLen + 1, inorder, index + 1, len - leftLen - 1);

        return root;
    }
}
