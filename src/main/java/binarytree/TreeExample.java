package binarytree;

public class TreeExample {

    static TreeNode head = null, prev =null;
    public static void treeToList(TreeNode root) {

        if (root == null) return;
        treeToList(root.left);

        if (head == null) {
           head = root;
           prev = head;
        }else {
            prev.right = root;
            root.left = prev;
            prev = root;

        }
        treeToList(root.right);

    }



}
