package binarytree;

import binarytree.TreeNode;

public class LCAWithResult {

    public static TreeNode lca(TreeNode root, int key1, int key2) {

        if (root == null) return null;
        if (root.data == key1 || root.data == key2) return root;
        TreeNode leftLCA = lca(root.left, key1, key2);
        TreeNode rightLCA = lca(root.right, key1, key2);
        if (leftLCA != null && rightLCA != null) return root;
        return (leftLCA != null && rightLCA == null) ? leftLCA : rightLCA;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(8);
        root.left.right = new TreeNode(2);
        root.left.left = new TreeNode(0);

        System.out.print(lca(root, 0, 1).data);

    }
}
