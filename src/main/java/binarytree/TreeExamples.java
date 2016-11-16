package binarytree;

import divideandconquer.MajorityElement;

import java.util.Stack;

public class TreeExamples {

/*
        Size of Tree
* */
    public static int size(TreeNode root) {

        if (root == null) return 0;
        else return 1 + size(root.left) + size(root.right);

    }

    /*  height of tree
    * */

    public static int height(TreeNode root) {

        if (root == null) return 0;
        else return 1 + Math.max(height(root.left), height(root.right));
    }

    /*  identical tree
    * */
    public static boolean isIdenticalTrees(TreeNode root1, TreeNode root2) {

        return (root1 == null && root2 ==null) || ((root1 != null && root2 != null)) && ((root1.data == root2.data)
                && (isIdenticalTrees(root1.left, root2.left)) &&
                (isIdenticalTrees(root1.right, root2.right)));
    }
    /*  mirror tree
    * */

    public static void mirrorTree(TreeNode root) {

        if (root == null) return;
        mirrorTree(root.left);
        mirrorTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    /*
    *   preoder traversal
    * */
    public static void preOrder(TreeNode root) {

        if (root == null) return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    //isLeaf

    public static boolean isLeaf(TreeNode root) {

        return root.left == null && root.right == null;
    }
//root to leaf paths
    public static void printRootToPaths(TreeNode root, String sofar) {

        if (root != null) {
            if (isLeaf(root)) {
                System.out.println(sofar + root.data + " ");
            } else {
                printRootToPaths(root.left, sofar + root.data + " ");
                printRootToPaths(root.right, sofar + root.data + " ");
            }
        }
    }

    public static int getChildSum(TreeNode root) {
        if (root == null) return 0;
        return root.left.data + root.right.data;
    }
    //Check check childsum prodperty
    public static boolean isChildsum(TreeNode node) {

        if (!isLeaf(node) && node != null) {
            return node.data == getChildSum(node) && isChildsum(node.left)
                    && isChildsum(node.right);
        }
        return true;
    }
    //convert to child sum property
    public static void convertTreeChidSum(TreeNode node) {

        if (!isLeaf(node) && node != null) {
            convertTreeChidSum(node.left);
            convertTreeChidSum(node.right);
            node.data = getChildSum(node);
        }
    }
    // diameter
    public static int diameter(TreeNode root) {

        if (root == null) return 0;
        else
            return Math.max(1 + height(root.left) + height(root.right),
                    Math.max(diameter(root.left), diameter(root.right)));
    }



            /*              *
            *               **
            *              ****
            *
            * */

    public static void space() {
        System.out.print(" ");
    }

    public static void star() {
        System.out.print("*");
    }
    public static void printStar(int n) {

            int mid = n / 2;
            int l = mid, r = mid;

            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == l || j == r) star();
                    else space();
                }
                l--;
                r++;
                System.out.println();
            }

        for (int i = 0; i < n/2 + 1; i++) System.out.print("* ");
    }
    //Efficient Diameter
    static class Height {
        int height = 0;
    }

    public static int diameterOpt(TreeNode root, Height nodeHeight) {

        if (root == null) {
            nodeHeight.height = 0;
            return 0;
        }else {
            Height lHeight = new Height(), rHeight = new Height();
            lHeight.height++;
            rHeight.height++;
            int lDiameter = diameterOpt(root.left, lHeight);
            int rDiamter = diameterOpt(root.right, rHeight);
            nodeHeight.height = 1 + Math.max(lHeight.height, rHeight.height);
            return Math.max(1 + lHeight.height + rHeight.height, Math.max(lDiameter, rDiamter));
        }


    }


//count leaves
    public  static int countLeaves(TreeNode node) {

        if (node == null) return 0;
        else if (isLeaf(node)) return 1;
        else return countLeaves(node.left) + countLeaves(node.right);
    }

    //print spiral
    public static void printSpiral(TreeNode root) {

        int h = height(root);
        boolean leftToRight = true;
        for (int i = 0; i < h; i++) {

            printLevelSpiral(root, i, leftToRight);
            System.out.println();
            leftToRight = !leftToRight ;
        }
    }

    public static void printLevelSpiral(TreeNode root, int level, boolean leftToRight) {

        if (root != null) {

            if (level == 0) System.out.print(root.data + " ");
            else if (leftToRight) {
                printLevelSpiral(root.left, level - 1, leftToRight);
                printLevelSpiral(root.right, level - 1, leftToRight);
            }else {
                printLevelSpiral(root.right, level - 1, leftToRight);
                printLevelSpiral(root.left, level - 1, leftToRight);
            }
        }

    }


    public static void printLeveOrder(TreeNode root) {

        int h = height(root);
        for (int i = 0; i < h; i++) {
            printLevel(root, i);
            System.out.println();
        }
    }
    static int leafLevel = Integer.MAX_VALUE;
    public static boolean isAtSameLevel(TreeNode root, int currentLevel) {

        if (root != null) {
            if(isLeaf(root)) {
                if (currentLevel > leafLevel) return false;
                leafLevel = currentLevel;
            }
            if(!isAtSameLevel(root.left, currentLevel + 1)) return false;
            if(!isAtSameLevel(root.right, currentLevel + 1)) return false;

        }
        return true;
    }

    public static void printLevel(TreeNode root, int level) {

        if (root != null) {
            if (level == 0) System.out.print(root.data + " ");
            else {
                printLevel(root.left, level - 1);
                printLevel(root.right, level - 1);
            }
        }
    }
    //find lca
    public static TreeNode lca(TreeNode root, int key1, int key2) {
        if (root == null) return root;
        if (root.data == key1 || root.data == key2) return root;
        TreeNode leftLCA = lca(root.left, key1, key2);
        TreeNode rightLCA = lca(root.right, key1, key2);

        if (leftLCA != null && rightLCA != null) return root;

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static  int search(int[] in, int key) {

        for (int i = 0; i < in.length; i++)
            if (in[i] == key) return i;
        return -1;
    }
    static int start = 0;

    // construct from pre and inorder
    public static TreeNode constructTree(int[] pre, int[] in, int left, int right) {

        if (left > right) return null;
        TreeNode root = new TreeNode(pre[start]);
        int mid = search(in, pre[start]);
        start++;
        root.left = constructTree(pre, in, left, mid - 1);
        root.right = constructTree(pre, in,mid + 1, right);

        return root;
    }

    // inorder traversal without recursion

    public static void inOrderWithoutTraversal(TreeNode node) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode root = node;
        while (!stack.isEmpty() || root != null) {
            if (root == null) {
                TreeNode temp = stack.pop();
                System.out.print(temp.data + " ");
                root = temp.right;

            }else {
                stack.add(root);
                root = root.left;
            }



        }
    }
    // check is tree height balanced or not
    public static boolean isBalanced(TreeNode root) {

        if (root != null) {
            int lHeight = height(root.left);
            int rHeight = height(root.right);
            return (Math.abs(lHeight - rHeight) < 2) && isBalanced(root.left) && isBalanced(root.right);
        }
        return true;
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(7);
//        root.right.right.right = new TreeNode(8);
        System.out.print(isAtSameLevel(root, 0));

//        TreeNode root1 = new TreeNode(1);
//        root1.left = new TreeNode(2);
//
//        int [] in = {2, 1, 3};
//        int [] pre = {1, 2, 3};
//        Height h = new Height();
//        inOrderWithoutTraversal(root);
//        printStar(10);
//        System.out.print(isChildsum(root));
//        System.out.print(isBalanced(root));
//        convertTreeChidSum(root);
//        preOrder(root);
//        System.out.print(diameterOpt(root, h));
//        int hk = h.height;
//        printSpiral(root);
//        printLeveOrder(root);
       // System.out.print(lca(root, 4, 5).data);
       // root1.right = new TreeNode(3);

//         mirrorTree(root);
       // preOrder(root);
//        printRootToPaths(root, "");
//        TreeNode newRoot = constructTree(pre, in,0, in.length - 1);
//        preOrder(newRoot);

//        System.out.print(isIdenticalTrees(root1, root));
    }
}
