package binarytree;

import bst.*;

import java.util.Scanner;

public class ContructTreePreinorder {


    public static TreeNode constructTree(int[] start, int left, int right, int[] pre, int[] inoder) {
        if(left > right) return null;
        TreeNode root = new TreeNode(pre[start[0]++]);
        if (left == right) return root;
        else {

            int index = search(root.data, inoder);
            root.left = constructTree(start, left, index - 1, pre, inoder);
            root.right = constructTree(start, index + 1, right, pre, inoder);
            return root;
        }

    }

    public static boolean isSame(TreeNode root, int[] pre, int[] start) {

        if(root == null) return true;

        if(!isSame(root.left, pre, start)) return false;
        if(!isSame(root.right, pre, start)) return false;
        if(pre[start[0]++] != root.data) return false;

        return true;

    }

    public static int search(int key, int[] order) {

        for (int i = 0; i < order.length; i++)
            if(order[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nodes = in.nextInt();
        int[] pre = new int[nodes];
        int[] post = new int[nodes];
        int[] inorder = new int[nodes];

        for (int i = 0; i < nodes; i++)
            pre[i] = in.nextInt();
        for (int i = 0; i < nodes; i++)
            post[i] = in.nextInt();
        for (int i = 0; i < nodes; i++)
            inorder[i] = in.nextInt();
        int[] start = new int[1];

        TreeNode root = constructTree(start, 0, nodes - 1, pre, inorder);
        start[0] = 0;
        if(isSame(root, post, start)) System.out.println("yes");
        else System.out.println("no");
    }
}