package bst;

import recursion.IncreasingDigits;

public class BST {

    public static void kthLargest(TreeNode root, int k) {
        TreeNode current = root, prev = null;

        while (current != null) {
            if(current.right == null) {
                if(--k == 0){
                    System.out.print(current.data);
                    return;
                }
                current = current.left;
            }
            else {
                prev = current.right;
                while (prev.left == null && prev.left == current) {
                    prev = prev.left;
                }
                if(prev.left == null) {
                    prev.left = current;
                    current = current.right;
                }
                else {
                    prev.left = null;
                    if(--k == 0){
                        System.out.print(current.data);
                        return;
                    }
                    current = current.left;
                }
            }
        }
    }
    public static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public static TreeNode delete(TreeNode root, int key) {
        if (root == null) return root;
        if(root.data < key) root.right = delete(root.right, key);
        else if(root.data > key) root.left = delete(root.left, key);
        else {
            if(root.left == null) {
                return root.right;
            }else if(root.right == null) {
                return root.left;
            }
            else {

                TreeNode minNode = findMin(root.right, root.right);
                root.data = minNode.data;
                root.right = delete(root.right, minNode.data);
            }

        }

        return root;
    }

    public static TreeNode findMin(TreeNode root, TreeNode acc) {

        if(root.left == null) {
            return acc;
        }else {
            return findMin(root.left, root.left);
        }

    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static TreeNode insert(TreeNode root, int key) {
        if ( root == null) return new TreeNode(key);
        if (root.data > key) root.left = insert(root.left, key);
        else if (root.data < key) root.right = insert(root.right, key);
        return root;

    }

    public static TreeNode find(TreeNode root, int key) {

        if (root == null) return null;
        if (root.data == key) return root;
        else if (root.data > key) return find(root.left, key);
        else return find(root.right, key);
    }

    public static boolean isBST2(TreeNode root, int min, int max) {

        if (root == null) return true;

        if (min > root.data || root.data > max ) return false;

        return  isBST2(root.left, min, root.data) && isBST2(root.right, root.data, max);

    }

    public static void printInRangesKeys(TreeNode root, int low, int high) {

        if (root == null) return;
        if (low <= root.data && root.data <= high) System.out.print(root.data);
        if (root.data <= low) printInRangesKeys(root.right, low, high);
        if (root.data >= high) printInRangesKeys(root.left, low, high);

    }
    public static class Checker{
        int prev= Integer.MIN_VALUE, cur = Integer.MIN_VALUE;
    }

    public static boolean isBST(TreeNode root, Checker checker) {

        if(root == null) return true;

        if(!(isBST(root.left, checker))) return false;
        if (checker.prev > root.data) return false;
        checker.prev = root.data;
        if(!(isBST(root.right, checker))) return false;

        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
       root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
       // root.right.left = new TreeNode(60);
       // root.right.right = new TreeNode(80);


        /*root = delete(root, 20);
        inorder(root);
        System.out.println();
        root = delete(root, 30);
        inorder(root);
        System.out.println();
        root = delete(root, 50);
        inorder(root);*/
        System.out.print(isBST(root, new Checker()));

        TreeNode r  = null;
        r = insert(r, 2);
        r = insert(r, 3);
        r = insert(r, 1);
       // System.out.print(find(r, 2).data);
      //  System.out.print(r.right.data);
        //inorder(r);
        //printInRangesKeys(root, 3, 5);
        //System.out.print(isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
      //  TreeNode acc = root;
       // System.out.print(findMin(root, acc).data);
        // kthLargest(root, 2);
    }
}
