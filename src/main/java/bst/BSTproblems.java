package bst;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class BSTproblems {
//--------------------------------------------------------------------------------------------
    /*Convert a BST to a Binary Tree such that sum of all greater keys is added to every key
    * */

    static  int sum = 0;
    public static void convertToGreaterSum(TreeNode root) {

        if (root == null) return;
        convertToGreaterSum(root.right);
        sum += root.data;
        root.data = sum;
        convertToGreaterSum(root.left);
    }

    public static void preOder(TreeNode root) {
        if (root == null) return;

        preOder(root.left);
        System.out.print(root.data + " ");
        preOder(root.right);
    }
    //--------------------------------------------------------------------------------------------
    /*K’th Largest Element in BST when modification to BST is not allowed
    * */
    static int c = 0;
    static TreeNode result = null;

    public static void kthLargestNode(TreeNode root, int k) {

        if (root == null || c >= k) return;
        kthLargestNode(root.right, k);
        c++;
        if (k == c) {
            result = root;
            return ;
        }
        kthLargestNode(root.left, k);
    }
    //--------------------------------------------------------------------------------------------

    /*Store inorder traversal of tree
    * */

    public static void inorderArray(TreeNode root, ArrayList<Integer> inorder) {

        if (root == null) return;
        inorderArray(root.left, inorder);
        inorder.add(root.data);
        inorderArray(root.right, inorder);
    }
    //--------------------------------------------------------------------------------------------

    //sorted array to bst

    public static TreeNode arrayToBST(ArrayList<Integer> inorder, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left = arrayToBST(inorder, left, mid - 1);
        root.right = arrayToBST(inorder, mid + 1, right);
        return root;
    }
    //--------------------------------------------------------------------------------------------

    /*Binary Tree to Binary Search Tree Conversion
    * */

    public static TreeNode binaryTreeToBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        inorderArray(root, inorder);
        Collections.sort(inorder);
        TreeNode newBSTRoot = arrayToBST(inorder, 0, inorder.size() - 1);
        return newBSTRoot;
    }
    //--------------------------------------------------------------------------------------------
    //Insertion in bst
    static class Successor {
        TreeNode succ = null;
    }

    public static TreeNode insert(TreeNode root, int data, Successor successor) {
        if (root == null) return new TreeNode(data);
        else if (root.data > data) {
            successor.succ = root;
            root.left = insert(root.left, data, successor);
        }
        else root.right = insert(root.right, data, successor);

        return root;
    }

    //Replace every element with the least greater element on its right
    public static void replaceArray(int[] arr) {

        TreeNode root = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            Successor successor = new Successor();
            root = insert(root, arr[i], successor);
            if (successor.succ!= null) arr[i] = successor.succ.data;
            else arr[i] = -1;
        }
    }


    //--------------------------------------------------------------------------------------------
    //    Given n appointments, find all conflicting appointments

    //--------------------------------------------------------------------------------------------
    //    Convert BST into a Min-Heap
    public static void bstToMinHeap(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        inorderArray(root, inorder);
    }
    //--------------------------------------------------------------------------------------------
    static class Relative {
        TreeNode succ = null, pre = null;

    }
    //    Inorder predecessor and successor for a given key in BST
    public static void inorderPreSucc(TreeNode root, int key) {
       Relative relative = null;
//       inorderSuccessor(root, key, relative);
//       inorderPredeccor(root, key, relative);
        System.out.print(relative.succ.data);
        System.out.print(relative.pre.data);
    }
    //--------------------------------------------------------------------------------------------
    //Transform a BST to greater sum tree
    public static void greaterSumTree(TreeNode root) {
        if (root == null) return;
        greaterSumTree(root.right);
        sum += root.data;
        root.data = sum - root.data;
        greaterSumTree(root.left);
    }

    //--------------------------------------------------------------------------------------------
    //    Remove BST keys outside the given range
    //--------------------------------------------------------------------------------------------
    //    Find a pair with given sum in a Balanced BST
    //--------------------------------------------------------------------------------------------
    //    Find if there is a triplet in a Balanced BST that adds to zero
    //--------------------------------------------------------------------------------------------
    //  Construct BST from given preorder traversal
    //--------------------------------------------------------------------------------------------
    //  Two nodes of a BST are swapped, correct the BST
    //--------------------------------------------------------------------------------------------
    //Print BST keys in the given range
    //--------------------------------------------------------------------------------------------
    //    Count inversions in an array
    //--------------------------------------------------------------------------------------------
    //K’th smallest element in BST using O(1) Extra Space (Morris Traversal)
    //    Count BST subtrees that lie in given range
    //--------------------------------------------------------------------------------------------
    //Count BST nodes that lie in a given range
    //--------------------------------------------------------------------------------------------
    //Data Structure for a single resource reservations
    //    Check if each internal node of a BST has exactly one child
    //--------------------------------------------------------------------------------------------
    //    Merge Two Balanced Binary Search Trees
    public static TreeNode mergeBSTs(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        inorderArray(root1, arr1);
        inorderArray(root2, arr2);
        ArrayList<Integer> mergedList = mergeTwoArrayList(arr1, arr2);
        return arrayToBST(mergedList, 0, mergedList.size() - 1);
    }
    //--------------------------------------------------------------------------------------------
    //Merge two sorted arrayList
    public static ArrayList<Integer> mergeTwoArrayList(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) mergedList.add(arr1.get(i++));
            else mergedList.add(arr2.get(j++));
        }
        while (i < arr1.size()) mergedList.add(arr1.get(i++));
        while (j < arr2.size()) mergedList.add(arr1.get(j++));
        return mergedList;
    }


    //--------------------------------------------------------------------------------------------
    //    Sorted Linked List to Balanced BST
    //--------------------------------------------------------------------------------------------
    public static TreeNode minValue(TreeNode root) {
        if (root.left == null) return root;
        return minValue(root.left);
    }
    //    Inorder Successor in Binary Search Tree
    public static void inorderSuccessor(TreeNode root, TreeNode node, Relative relative) {

        if (node.right != null) relative.succ = minValue(node.right);
        while (root != null) {

             if (node.data < root.data) {
                relative.succ = root;
                root = root.left;
            } else if (node.data > root.data) root = root.right;
            else break;
        }
    }
    //    Inorder Predecessor in Binary Search Tree
    public static void inorderPredeccor(TreeNode root, TreeNode node, Relative relative) {
        if (node.left != null)
        if (root != null) {
            if (node.data > root.data) {
                relative.pre = root;
                inorderPredeccor(root.right, node, relative);
            }else inorderPredeccor(root.left, node, relative);
        }
    }
    //--------------------------------------------------------------------------------------------
    //    Find k-th smallest element in BST
    static int count = 0;
    public static boolean kthSmallet(TreeNode root, int k) {

        if (root != null) {
            if (kthSmallet(root.left, k)) return true;
            if (++count == k) {
                System.out.print(root.data);
                return true;
            }
            if (kthSmallet(root.right, k)) return true;
        }
        return false;
    }
    //--------------------------------------------------------------------------------------------

    //    Lowest Common Ancestor in a Binary Search Tree.
    public static TreeNode lca(TreeNode root, int value1, int value2) {
        if (root == null) return root;
        else if (value1 < root.data && value2 < root.data) return lca(root.left, value1, value2);
        else if (value1 > root.data && value2 > root.data) return lca(root.right, value1, value2);
        return root;
    }

    //--------------------------------------------------------------------------------------------
    //    Check if a binary tree is BST or not
    static int prev = Integer.MIN_VALUE;
    public static boolean isBST(TreeNode root) {
        if(root != null) {
            if (!isBST(root.left)) return false;
            if (prev >= root.data) return false;
            prev = root.data;
            if (!isBST(root.right)) return false;
        }
        return true;
    }
    //--------------------------------------------------------------------------------------------

    //Deletion from BST
    //--------------------------------------------------------------------------------------------
    //    Search and Insert in BST
    //--------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(6);
//        root.left.right.left = new TreeNode(10);
//        root.left.right.right = new TreeNode(14);
//        convertToGreaterSum(root);
//        preOder(root);
//        kthLargestNode(root, 3);
//        System.out.print(result.data);
//        TreeNode newBSTRoot = binaryTreeToBST(root);
//        preOder(newBSTRoot);

//        int[] arr = {8, 58, 71, 18, 31, 32, 63, 92,
//                43, 3, 91, 93, 25, 80, 28};
//        replaceArray(arr);
//        for (int n : arr) System.out.print(n + " ");
//    System.out.print(isBST(root));
//preOder(mergeBSTs(root1, root));
//inorderPreSucc(root, 2);
        Relative relative = new Relative();
        inorderSuccessor(root, root, relative);
        System.out.print( relative.succ.data);
    }
}
