package avltree;

public class TreeNode {

    int key, height;
    TreeNode left, right;

    public TreeNode(int key) {
        this.key = key;
        this.left = this.right = null;
        this.height = 1;
    }
}
