package tree;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinTrees {

    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        if (start <= 0 || start > end) {
            return null;
        }

        List<TreeNode> list = new ArrayList<>();
        if (start == end) {
            list.add(new TreeNode(start));
            return list;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftNodes = generateTrees(start, i - 1);
            List<TreeNode> rightNodes = generateTrees(i + 1, end);
            list.addAll(createTrees(i, leftNodes, rightNodes));
        }

        return list;
    }

    private List<TreeNode> createTrees(int val, List<TreeNode> leftNodes, List<TreeNode> rightNodes) {
        boolean isLeftEmpty = leftNodes == null || leftNodes.isEmpty();
        boolean isRightEmpty = rightNodes == null || rightNodes.isEmpty();

        List<TreeNode> list = new ArrayList<>();
        if (isLeftEmpty && isRightEmpty) {
            list.add(new TreeNode(val));
        } else if (isLeftEmpty) {
            for (TreeNode rightNode : rightNodes) {
                TreeNode root = new TreeNode(val);
                root.right = rightNode;
                list.add(root);
            }
        } else if (isRightEmpty) {
            for (TreeNode leftNode : leftNodes) {
                TreeNode root = new TreeNode(val);
                root.left = leftNode;
                list.add(root);
            }
        } else {
            for (TreeNode leftNode : leftNodes) {
                for (TreeNode rightNode : rightNodes) {
                    TreeNode root = new TreeNode(val);
                    root.left = leftNode;
                    root.right = rightNode;
                    list.add(root);
                }
            }
        }

        return list;
    }

}
