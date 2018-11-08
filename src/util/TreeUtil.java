package util;

import model.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class TreeUtil {
    private TreeUtil() {
    }

    private static TreeNode NULL_NODE = new TreeNode(-1);

    public static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null) {
            return 1 + depth(node.right);
        }
        if (node.right == null) {
            return 1 + depth(node.left);
        }

        int a = depth(node.left);
        int b = depth(node.right);

        return 1 + Math.max(a, b);
    }

    public static TreeNode createBinaryTreeNode(Integer[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(nums[0]);
        createTreeNode(nums, 2, root);
        return root;
    }

    private static void createTreeNode(Integer[] nums, int index, TreeNode parentNode) {
        if (index > nums.length) {
            return;
        }

        Integer leftV = nums[index - 1];
        if (leftV != null) {
            TreeNode leftNode = new TreeNode(leftV);
            createTreeNode(nums, 2 * index, leftNode);
            parentNode.left = leftNode;
        }

        if (index < nums.length) {
            Integer rightV = nums[index];
            if (rightV != null) {
                TreeNode rightNode = new TreeNode(rightV);
                createTreeNode(nums, 2 * (index + 1), rightNode);
                parentNode.right = rightNode;
            }
        }
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Empty");
        } else {
            System.out.println(formatTree(root));
        }
    }

    private static String formatTree(TreeNode root) {
        if (root == null) {
            return "()";
        }

        String left = formatTree(root.left);
        String right = formatTree(root.right);

        String format = "(%s (%s) (%s))";

        return String.format(format, root.val, left, right);
    }

    public static void printNode(TreeNode root) {
        if (root == null) {
            System.out.println("Empty tree node");
            return;
        }

        List<String> result = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedBlockingDeque<>();
        nodeQueue.add(root);
        while (!isAllEmpty(nodeQueue)) {
            int len = nodeQueue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = nodeQueue.poll();
                if (node == NULL_NODE || node == null) {
                    result.add("null");
                    nodeQueue.offer(NULL_NODE);
                    nodeQueue.offer(NULL_NODE);
                } else {
                    result.add("" + node.val);
                    if (node.left == null) {
                        nodeQueue.offer(NULL_NODE);
                    } else {
                        nodeQueue.offer(node.left);
                    }
                    if (node.right == null) {
                        nodeQueue.offer(NULL_NODE);
                    } else {
                        nodeQueue.offer(node.right);
                    }
                }
            }
        }

        int len = findLastNotEmpty(result);
        if (len == -1) {
            System.out.println("Empty tree node");
        } else {
            System.out.println(Arrays.toString(
                    Arrays.copyOf(result.toArray(), len + 1) ));
        }
    }

    private static boolean isAllEmpty(Queue<TreeNode> nodeQueue) {
        if (nodeQueue == null) {
            return true;
        }

        for (TreeNode node : nodeQueue) {
            if (node.val != -1) {
                return false;
            }
        }

        return true;
    }

    private static int findLastNotEmpty(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (!"null".equals(list.get(i))) {
                return i;
            }
        }

        return -1;
    }
}
