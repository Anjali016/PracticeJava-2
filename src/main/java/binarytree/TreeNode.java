package binarytree;

public class TreeNode {

    int data ;
    TreeNode left, right;

    public TreeNode(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }

    public void postOrder(TreeNode root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
}
