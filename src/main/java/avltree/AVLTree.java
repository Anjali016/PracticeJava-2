package avltree;
/*
*
*                    z
*                   /  \
*                  y    t4
 *                /  \
 *               x     t3
 *              /  \
 *
  *           t1     t2
  *
  *                      y
  *                   /     \
  *                  x        z
  *                         /  \
   *                       t3    t4
   *
   *
   *                       z
   *                     /   \
   *                    t1     y
   *                             \
   *                              x
*
* */

public class AVLTree {

    public int getBalance(TreeNode node) {

        return node.left.height - node.right.height;
    }

    public TreeNode leftRotation(TreeNode node) {
        TreeNode y = node.right;
        TreeNode temp = y.left;
        y.left = node;
        node.right = temp;

        node.height = Math.max(node.left.height, node.right.height) + 1;
        y.height    = Math.max(y.left.height, y.right.height) + 1;

        return y;
    }

    public TreeNode rightRotation(TreeNode node) {

        TreeNode y = node.left;
        TreeNode temp = y.right;
        y.right = node;
        node.left = temp;

        y.height = Math.max(y.left.height, y.right.height) + 1;
        node.height = Math.max(node.left.height, node.right.height) +1;

        return y;
    }

    public int height(TreeNode node) {

        if(node == null) return 0;
        return node.height;
    }
    public TreeNode insert(TreeNode root, int key) {

        if(root == null) {
            return new TreeNode(key);
        }
        if(root.key < key) root.right = insert(root.right, key);
        else if(root.key > key) root.left = insert(root.left, key);

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int weight = getBalance(root);

        if(weight > 1 && root.left.key > key) return rightRotation(root);
        if(weight > 1 && root.left.key < key) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        if(weight > -1 && root.right.key < key) return leftRotation(root.right);
        if(weight > -1 && root.right.key > key)  {
            root.right = rightRotation(root.left);
            return leftRotation(root);
        }

        return root;

    }

    public void delete(TreeNode root, int key) {

    }
}
