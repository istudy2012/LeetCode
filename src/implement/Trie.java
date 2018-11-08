package implement;

public class Trie {
    private TrieNode root = new TrieNode();

    void add(String word) {
        if (word.length() == 0) {
            return;
        }

        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children == null) {
                node.children = new TrieNode[26];
            }
            if (node.children[i] == null) {
                node.children[i] = new TrieNode();
            }
            node = node.children[i];
        }
        node.isEnd = true;
    }

    private String result = "";
    String getTarget() {
        result = "";
        dfs(root, "", 0);
        return result;
    }

    private void dfs(TrieNode node, String prefix, int count) {
        if (node == null) {
            return;
        }

        if (prefix.length() == count) {
            if (count > result.length()) {
                result = prefix;
            }
        } else {
            return;
        }

        if (node.children == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            TrieNode childNode = node.children[i];
            if (childNode != null) {
                int newCount;
                if (childNode.isEnd) {
                    newCount = count + 1;
                } else {
                    newCount = count;
                }
                dfs(childNode, prefix + (char) ('a' + i), newCount);
            }
        }
    }

    private static class TrieNode {
        boolean isEnd;
        TrieNode[] children;
    }
}