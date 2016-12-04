package binarytree;

import java.util.*;

public class TreeExamples {

    /**
     * 1.
     * Problem: Tree Traversals

     * Solution:
     */


    /**
     * 2.
     * Problem: Write a program to Calculate Size of a tree

     * Solution:
     */


    /**
     * 3.
     * Problem: Write Code to Determine if Two Trees are Identical

     * Solution:
     */


    /**
     * 4.
     * Problem:

     * Solution: Write a Program to Find the Maximum Depth or Height of a Tree
     */

    public static int height(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(height(root.left), height(root.right));
    }
    /**
     * 5.
     * Problem:

     * Solution: Write a program to Delete a Tree.
     */

    /**
     * 6.
     * Problem: Write an Efficient Function to Convert a Binary Tree into its Mirror Tree

     * Solution:
     */


    /**
     * 7.
     * Problem: If you are given two traversal sequences, can you construct the binary tree?

     * Solution:
     */


    /**
     * 8.
     * Problem: Given a binary tree, print out all of its root-to-leaf paths one per line.

     * Solution:
     */


    /**
     * 9.
     * Problem: Lowest Common Ancestor in a Binary Search Tree.

     * Solution:
     */


    /**
     * 10.
     * Problem: The Great Tree-List Recursion Problem.

     * Solution:
     */


    /**
     * 11.
     * Problem: Level Order Tree Traversal

     * Solution:
     */


    /**
     * 12.
     * Problem: Program to count leaf nodes in a binary tree

     * Solution:
     */


    /**
     * 13.
     * Problem: Level order traversal in spiral form

     * Solution:
     */


    /**
     * 14.
     * Problem: Check for Children Sum Property in a Binary Tree

     * Solution:
     */

    /**
     * 15.
     * Problem: Convert an arbitrary Binary Tree to a tree that holds Children Sum Property

     * Solution:
     */

    /**
     * 16.
     * Problem: Diameter of a Binary Tree

     * Solution:
     */


    /**
     * 17.
     * Problem: How to determine if a binary tree is height-balanced?

     * Solution:
     */


    /**
     * Page 13.
     * 18.
     * Problem: Inorder Tree Traversal without Recursion

     * Solution:
     */


    /**
     * Page 12.
     * 19.
     * Problem: Inorder Tree Traversal without recursion and without stack!

     * Solution:
     */


    /**
     * 20.
     * Problem: Root to leaf path sum equal to a given number

     * Solution:
     */


    /**
     * 21.
     * Problem: Construct Tree from given Inorder and Preorder traversals

     * Solution:
     */


    /**
     * 22.
     * Problem: Given a binary tree, print all root-to-leaf paths

     * Solution:
     */

    /**
     * 23.
     * Problem: Double Tree

     * Solution:
     */


    /**
     * 24.
     * Problem: Maximum width of a binary tree

     * Solution:
     */


    /**
     * 25.
     * Problem: Foldable Binary Trees

     * Solution:
     */


    /**
     * 26.
     * Problem: Print nodes at k distance from root
     * Given a root of a tree, and an integer k. Print all the nodes which are at k distance from root.
     * Solution:
     */
    public static void printNodesAtKdistance(TreeNode root, int k) {
        if (root == null) return;
        else if (k == 0) System.out.print(root.data);
        else {
            printNodesAtKdistance(root.left, k - 1);
            printNodesAtKdistance(root.right, k - 1);
        }
    }



    /**
     * 27.
     * Problem: Applications of tree data structure

     * Solution:
     */


    /**
     * 28.
     * Problem: Get Level of a node in a Binary Tree
     * Given a Binary Tree and a key, write a function that returns level of the key.
     * Solution: The idea is to start from the root and level as 1.
     * If the key matches with root’s data, return level. Else recursively call for left and right subtrees with level as level + 1.
     */

    public static int getLevel(TreeNode root, TreeNode node, int level) {
        if (root == null) return 0;
        else if (root == node) return level;
        else return getLevel(root.left, node, level + 1) + getLevel(root.right, node, level + 1);
    }



    /**
     * Page 12.
     * 29.
     * Problem: Print Ancestors of a given node in Binary Tree

     * Solution:
     */

    /**
     * 30.
     * Problem: Check if a given Binary Tree is SumTree

     * Solution:
     */


    /**
     * 31.
     * Problem: Check if a binary tree is subtree of another binary tree | Set 1

     * Solution:
     */



    /**
     * 32.
     * Problem: Connect nodes at same level

     * Solution:
     */



    /**
     * 33.
     * Problem: Connect nodes at same level using constant extra space

     * Solution:
     */
    /**
     * 34.
     * Problem: Populate Inorder Successor for all nodes

     * Solution:
     */



    /**
     * 35.
     * Problem: Convert a given tree to its Sum Tree

     * Solution:
     */


    /**
     * 36.
     * Problem: Vertical Sum in a given Binary Tree | Set 1

     * Solution:
     */


    /**
     * 37.
     * Problem: Find the maximum sum leaf to root path in a Binary Tree

     * Solution:
     */


    /**
     * 38.
     * Problem: Construct Special Binary Tree from given Inorder traversal

     * Solution:
     */


    /**
     * 39.
     * Problem: Construct a special tree from given preorder traversal

     * Solution:
     */


    /**
     * Page 11.
     * 40.
     * Problem: Check whether a given Binary Tree is Complete or not | Set 1 (Iterative Solution)

     * Solution:
     */


    /**
     * Page 10.
     * 41.
     * Problem: Boundary Traversal of binary tree

     * Solution:
     */

    /**
     * 42.
     * Problem: Construct Full Binary Tree from given preorder and postorder traversals

     * Solution:
     */


    /**
     * 43.
     * Problem: Iterative Preorder Traversal

     * Solution:
     */


    /**
     * 44.
     * Problem: Morris traversal for Preorder

     * Solution:
     */


    /**
     * 45.
     * Problem: Linked complete binary tree & its creation

     * Solution:
     */


    /**
     * 46.
     * Problem: Iterative Postorder Traversal | Set 2 (Using One Stack)

     * Solution:
     */


    /**
     * 47.
     * Problem: Reverse Level Order Traversal

     * Solution:
     */


    /**
     * 48.
     * Problem: Construct Complete Binary Tree from its Linked List Representation

     * Solution:
     */

    /**
     * 49.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 1

     * Solution:
     */


    /**
     * Page 10
     * 50.
     * Problem: Tree Isomorphism Problem

     * Solution:
     */


    /**
     * Page 9.
     * 51.
     * Problem: Iterative Method to find Height of Binary Tree

     * Solution:
     */


    /**
     * 52.
     * Problem: Custom Tree Problem

     * Solution:
     */


    /**
     * 53.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 2
     * Solution:
     */


    /**
     * 54.
     * Problem: Difference between sums of odd level and even level nodes of a Binary Tree

     * Solution:
     */


    /**
     * 55.
     * Problem: Print Postorder traversal from given Inorder and Preorder traversals

     * Solution:
     */

    /**
     * 56.
     * Problem: Find depth of the deepest odd level leaf node

     * Solution:
     */


    /**
     * 57.
     * Problem: Check if all leaves are at same level

     * Solution:
     */


    /**
     * 58.
     * Problem: Print Left View of a Binary Tree

     * Solution:
     */


    /**
     * 59.
     * Problem: Remove all nodes which don’t lie in any path with sum>= k

     * Solution:
     */


    /**
     * 60.
     * Problem: Extract Leaves of a Binary Tree in a Doubly Linked List

     * Solution:
     */


    /**
     * Page 9.
     * 61.
     * Problem: Deepest left leaf node in a binary tree

     * Solution:
     */


    /**
     * Page 8.
     *  62.
     * Problem: Find next right node of a given key

     * Solution:
     */

    /**
     * 63.
     * Problem: Sum of all the numbers that are formed from root to leaf paths

     * Solution:
     */


    /**
     * 64.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 3

     * Solution:
     */


    /**
     * 65.
     * Problem: Print all nodes that don’t have sibling

     * Solution:
     */


    /**
     * 66.
     * Problem: Lowest Common Ancestor in a Binary Tree | Set 1

     * Solution:
     */


    /**
     * 67.
     * Problem: Find distance between two given keys of a Binary Tree

     * Solution:
     */


    /**
     * 68.
     * Problem: Print all nodes that are at distance k from a leaf node

     * Solution:
     */

    /**
     * 69.
     * Problem: Check if a given Binary Tree is height balanced like a Red-Black Tree

     * Solution:
     */

    /**
     * 70.
     * Problem: Print a Binary Tree in Vertical Order | Set 1

     * Solution:
     */

    /**
     * 71.
     * Problem: Print all nodes at distance k from a given node

     * Solution:
     */

    /**
     * 72.
     * Problem: Construct a tree from Inorder and Level order traversals

     * Solution:
     */

    /**
     * Page 7.
     * 73.
     * Problem: Print Right View of a Binary Tree

     * Solution:
     */

    /**
     * 74.
     * Problem: Print a Binary Tree in Vertical Order | Set 2 (Hashmap based Method)
     * Solution:
     */

    /**
     * 75.
     * Problem:Reverse alternate levels of a perfect binary tree

     * Solution:
     */

    /**
     * 76.
     * Problem: Find the maximum path sum between two leaves of a binary tree

     * Solution:
     */

    /**
     * 77.
     * Problem: Check if a binary tree is subtree of another binary tree | Set 2

     * Solution:
     */

    /**
     * 78.
     * Problem: Check if two nodes are cousins in a Binary Tree

     * Solution:
     */

    /**
     * Page 7.
     *  79.
     * Problem: Minimum no. of iterations to pass information to all nodes in the tree

     * Solution:
     */

    /**
     * Page 7.
     * 80.
     * Problem: Find Height of Binary Tree represented by Parent array

     * Solution:
     */

    /**
     * Page 7.
     * 81.
     * Problem: Print nodes between two given level numbers of a binary tree

     * Solution:
     */

    /**
     * Page 7.
     * 82.
     * Problem: Serialize and Deserialize a Binary Tree

     * Solution:
     */

    /**
     * Page 7.
     * 83.
     * Problem: Serialize and Deserialize an N-ary Tree

     * Solution:
     */

    /**
     * Page 6.
     * 84.
     * Problem: Convert a Binary Tree to Threaded binary tree

     * Solution:
     */

    /**
     * Page 6.
     * 85.
     * Problem: Print Nodes in Top View of Binary Tree
     * Top view of a binary tree is the set of nodes visible when the tree is viewed from the top.
     * Given a binary tree, print the top view of it. The output nodes can be printed in any order.
     * Expected time complexity is O(n)

     * Solution: Use HasSet, BFS, and mark the position.
     */

    public static void printTopView(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        Set<Integer> set = new HashSet<Integer>();
        HashMap<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        map.put(root, 0);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            int position = map.get(curr);
            if (set.add(position)) System.out.print(curr.data + " ");
            if (curr.left != null) {
                queue.add(curr.left);
                map.put(curr.left, map.get(curr) - 1);
            }
            if (curr.right != null) {
                queue.add(curr.right);
                map.put(curr.right, map.get(curr) + 1);
            }
        }
    }


    /**
     * Page 6.
     * 86.
     * Problem: Perfect Binary Tree Specific Level Order Traversal

     * Solution:
     */

    /**
     * Page 6.
     * 87.
     * Problem: Bottom View of a Binary Tree

     * Solution: Use BFS and  TreeMap to store pos - > Node and replace every pos with new Node
     */
    public static void bottomView(TreeNode root) {
        if (root == null) return;
        TreeMap<Integer, TreeNode> resultMap = new TreeMap<Integer, TreeNode>();
        Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        map.put(root, 0);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            int position = map.get(curr);
            resultMap.put(position, curr);
            if (curr.left != null) {
                queue.add(curr.left);
                map.put(curr.left, map.get(curr) - 1);
            }
            if (curr.right != null) {
                queue.add(curr.right);
                map.put(curr.right, map.get(curr) + 1);
            }
        }
        for (int key : resultMap.keySet()) System.out.print(resultMap.get(key).data + " ");

    }

    /**
     * Page 6.
     * 88.
     * Problem: Diagonal Sum of a Binary Tree

     * Solution:
     */



    /**
     * Page 6.
     * 89.
     * Problem: Find the closest leaf in a Binary Tree

     * Solution:
     */

    /**
     * Page 6.
     * 90.
     * Problem: Remove nodes on root to leaf paths of length < K

     * Solution:
     */

    /**
     * Page 6.
     * 91.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 3

     * Solution:
     */


    /**
     * Page 6.
     * 92.
     * Problem: Find sum of all left leaves in a given Binary Tree
     * Solution: The idea is to traverse the tree return sum of all left leaves.
     */
    public static int sumOfLeftLeaves(TreeNode root, boolean isLeftLeaf) {
            if (root == null) return 0;
            else if (isLeaf(root) && isLeftLeaf) return root.data;
            else return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }

    public static boolean isLeft(TreeNode parent, TreeNode node) {
        if (parent == null) return false;
        else return parent.left == node;
    }

    public static int sumOfLeftLeaves2(TreeNode root, TreeNode parent) {
        if (root == null) return 0;
        else if (isLeaf(root) && parent.left == root) return root.data;
        else return sumOfLeftLeaves2(root.left, root) + sumOfLeftLeaves2(root.right, root);

    }



     /**
     * Page 6.
     * 93.
     * Problem: Check whether a binary tree is a full binary tree or not

     * Solution:
     */


     /**
     * Page 6.
     * 94.
     * Problem: Check whether a binary tree is a complete tree or not | Set 2 (Recursive Solution)

     * Solution:
     */

    /**
     * Page 6.
     * 95. Problem: Given a binary tree, how do you remove all the half nodes?

     * Solution:
     */

    /**
     * Page 5.
     * 96. Problem: Handshaking Lemma and Interesting Tree Properties
     * Solution:
     */



    /**
     * 97
     * Problem: Expression Tree

     * Solution:
     */

    /**
     * 98
     * Problem: Maximum Path Sum in a Binary Tree

     * Solution:
     */

    /**
     * 99
     * Problem: Find Minimum Depth of a Binary Tree

     * Solution:
     */

    /**
     * 100
     * Problem: Symmetric Tree (Mirror Image of itself)

     * Solution:
     */




    /**
     * 101.
     * Problem: Construct Binary Tree from given Parent Array representation

     * Solution:
     */

    /**
     * 102.
     * Problem: Succinct Encoding of Binary Tree

     * Solution:
     */

    /**
     * 103
     * Problem: Mirror of n-ary Tree

     * Solution:
     */

    /**
     * 104.
     * Problem: Check if a given array can represent Preorder Traversal of Binary Search Tree

     * Solution:
     */


    /**
     * 105
     * Problem: Find Count of Single Valued Subtrees

     * Solution:
     */

    /**
     * 106
     * Problem: Find multiplication of sums of data of leaves at same levels

     * Solution:
     */

    /**
     * 107
     * Problem: Find LCA in Binary Tree using RMQ

     * Solution:
     */

    /**
     * 108
     * Problem: Find all possible binary trees with given Inorder Traversal

     * Solution:
     */



    /**
     * 109.
     * Problem: Locking and Unlocking of Resources arranged in the form of n-ary Tree

     * Solution:
     */

    /**
     * 110.
     * Problem: Closest leaf to a given node in Binary Tree

     * Solution:
     */

    /**
     * 111.
     * Problem: Check if leaf traversal of two Binary Trees is same?

     * Solution:
     */

    /**
     * 112.
     * Problem: Inorder Non-threaded Binary Tree Traversal without Recursion or Stack

     * Solution:
     */


    /**
     * 113.
     * Problem: Maximum difference between node and its ancestor in Binary Tree
     * Given a binary tree, we need to find maximum value we can get by subtracting value of node B from value of node A,
     * where A and B are two nodes of the binary tree and A is an ancestor of B. Expected time complexity is O(n).
     * Solution:
     */
    public static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public static int findAmplitude(TreeNode root, ArrayList<Integer> path) {
        if (isLeaf(root)) {
            path.add(root.data);
            return Collections.max(path) - Collections.min(path);
        }else {
            ArrayList<Integer> newPath = new ArrayList<Integer>();
            newPath.addAll(path);
            newPath.add(root.data);
            return Math.max(findAmplitude(root.left, newPath), findAmplitude(root.right, newPath));
        }
    }
    /**
     * 114.
     * Problem: BFS vs DFS for Binary Tree

     * Solution: A Tree is typically traversed in two ways:
     * Breadth First Traversal (Or Level Order Traversal)
     * Depth First Traversals
     * Inorder Traversal (Left-Root-Right)
     * Preorder Traversal (Root-Left-Right)
     * Postorder Traversal (Left-Right-Root)
     *
     *
     * Is there any difference in terms of Time Complexity?
     * All four traversals require O(n) time as they visit every node exactly once.
     * Is there any difference in terms of Extra Space.
     * There is difference in terms of extra space required.
     * Extra Space required for Level Order Traversal is O(w) where w is maximum width of Binary Tree. In level order traversal, queue one by one stores nodes of different level.
     * Extra Space required for Depth First Traversals is O(h) where h is maximum height of Binary Tree. In Depth First Traversals, stack (or function call stack) stores all ancestors of a node.
     * Maximum Width of a Binary Tree at depth (or height) h can be 2h where h starts from 0. So the maximum number of nodes can be at the last level. And worst case occurs when Binary Tree is a perfect Binary Tree with numbers of nodes like 1, 3, 7, 15, …etc. In worst case, value of 2h is Ceil(n/2).
     *
     * Height for a Balanced Binary Tree is O(Log n). Worst case occurs for skewed tree and worst case height becomes O(n).
     *
     * So in worst case extra space required is O(n) for both. But worst cases occur for different types of trees.
     * How to Pick One?
     * Extra Space can be one factor (Explained above.
     *
     * Depth First Traversals are typically recursive and recursive code requires function call overheads
     *
     * The most important points is, BFS starts visiting nodes from root while DFS starts visiting nodes from leaves.
     * So if our problem is to search something that is more likely to closer to root, we would prefer BFS.
     * And if the target node is close to a leaf, we would prefer DFS.
     */

    /**
     * 115.
     * Problem: Construct a Binary Search Tree from given postorder

     * Solution:
     */

    /**
     * 116.
     * Problem: Lowest Common Ancestor in a Binary Tree | Set 2 (Using Parent Pointer)

     * Solution:
     */


    /**
     * 117.
     * Problem: Check sum of Covered and Uncovered nodes of Binary Tree

     * Solution:
     */


    /**
     * 118.
     * Problem: Check if removing an edge can divide a Binary Tree in two halves

     * Solution:
     */


    /**
     * 119.
     * Problem: Print leftmost and rightmost nodes of a Binary Tree

     * Solution:
     */


    /**
     * 120.
     * Problem: Check if removing an edge can divide a Binary Tree in two halves
     *
     * Solution:
     */


    /**
     * 121.
     * Problem: Print leftmost and rightmost nodes of a Binary Tree

     * Solution:
     */

    /**
     * 122.
     * Problem: Vertical Sum in Binary Tree | Set 2 (Space Optimized)

     * Solution:
     */


    /**
     * 123.
     * Problem: Check if a binary tree is subtree of another binary tree | Set 1

     * Solution:
     */


    /**
     * 124.
     * Problem: Construct tree from ancestor matrix

     * Solution:
     */


    /**
     * 125.
     * Problem: Perfect Binary Tree Specific Level Order Traversal | Set 2

     * Solution:
     */


    /**
     * 126.
     * Problem: Convert a normal BST to Balanced BST

     * Solution:
     */


    /**
     * 127.
     * Problem: Convert a given Binary Tree to Doubly Linked List | Set 4

     * Solution:
     */


    /**
     * 128.
     * Problem: Diagonal Traversal of Binary Tree

     * Solution:
     */


    /**
     * 129.
     * Problem: Print root to leaf paths without using recursion

     * Solution:
     */


    /**
     * 130.
     * Problem: Non-recursive program to delete an entire binary tree

     * Solution:
     */


    /**
     * 131.
     * Problem: Density of Binary Tree in One Traversal

     * Solution:
     */


    /**
     * 132.
     * Problem: Density of Binary Tree in One Traversal

     * Solution:
     */


    /**
     * 133.
     * Problem: Number of ways to traverse an N-ary tree

     * Solution:
     */


    /**
     * 134.
     * Problem: Sink Odd nodes in Binary Tree

     * Solution:
     */


    /**
     * 135.
     * Problem: Print Binary Tree in 2-Dimensions

     * Solution:
     */

    /**
     * 136..
     * Problem: Create a Doubly Linked List from a Ternary Tree

     * Solution:
     */

    /**
     * 137.
     * Problem: How to determine if a binary tree is height-balanced?

     * Solution:
     */

    /**
     * 138.
     * Problem: Check if two trees are Mirror

     * Solution:
     */

    /**
     * 139.
     * Problem: Construct a Binary Tree from Postorder and Inorder

     * Solution:
     */

    /**
     * 140.
     * Problem: Find largest subtree having identical left and right subtrees

     * Solution:
     */


    /**
     * 141.
     * Problem: Iterative function to check if two trees are identical

     * Solution:
     */


    /**
     * 142.
     * Problem: Print cousins of a given node in Binary Tree

     * Solution:
     */

    public static void printCousinsNodes(TreeNode root, TreeNode node, int level) {
        if (root == null || level < 2) return;
        else if (level == 2) {
            if (root.left == node || root.right == node) return;
            if (root.left != null) System.out.print(root.data + " ");
            if (root.right != null) System.out.print(root.data + " ");
        }
        else {
            printCousinsNodes(root.left, node, level - 1);
            printCousinsNodes(root.right, node, level - 1);
        }
    }
    public static void printCousins(TreeNode root, TreeNode node) {
        if (root == null) return;
        int level = getLevel(root, node, 1);
        printCousinsNodes(root, node, level);
    }



    /**
     * 143.
     * Problem: Print extreme nodes of each level of Binary Tree in alternate order

     * Solution: Use Queue for efficient method
     */

    public static void printExtremeNodesAlt(TreeNode root) {
        int h = height(root);
        boolean flag = false;
        for (int i = 0; i < h; i++) {
            printLevelSpiral(root, i, flag);
            flag = !flag;
        }
    }
    public static boolean printLevelSpiral(TreeNode root, int level, boolean flag) {

        if (root == null) return true;
        else if (level == 0) {
            System.out.print(root.data + " ");
            return true;
        }
        else if (flag) {
            if (printLevelSpiral(root.left, level - 1, flag)) return true;
            if (printLevelSpiral(root.right, level - 1, flag)) return true;
        }
        else {
            if (printLevelSpiral(root.right, level - 1, flag)) return true;
            if (printLevelSpiral(root.left, level - 1, flag)) return true;
        }
        return false;
    }

    /**
     * 144.
     * Problem: Evaluation of Expression Tree

     * Solution:
     */


    /**
     * 145.
     * Problem: Find a number in minimum steps

     * Solution:
     */
    public static int minSteps(int source, int dest, int step) {
        if (Math.abs(source) > dest) return Integer.MAX_VALUE;
        else if (source == dest) return step;
        else return Math.min(minSteps(source - step - 1, dest, step + 1), minSteps(source + step + 1, dest, step + 1));
    }

    /**
     * 146.
     * Problem: Find height of a special binary tree whose leaf nodes are connected
     * Given a special binary tree whose leaf nodes are connected to form a circular doubly linked list,
     * find its height.
     * Solution: Node is leaf if (node.left.right = node && node.right.left == node)
     */

    public static boolean isLeafModified(TreeNode node) {
        return node.left != null && node.left.right == node &&  node.right != null && node.right.left == node;
    }
    public static int maxDepth(TreeNode node) {
        if (node == null) return 0;
        else if (isLeafModified(node)) return 1;
        else return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }


    /**
     * 147.
     * Problem: Convert a Binary Tree to a Circular Doubly Link List
     * Given a Binary Tree, convert it to a Circular Doubly Linked List (In-Place).
     * Solution:
     */
    static TreeNode head = null;
    static TreeNode prev = null;
    public static void convertToCDLL(TreeNode root) {
        if (root == null) return;
        convertToCDLL(root.left);
        if (head == null) head = root;
        else {
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        convertToCDLL(root.right);
    }

    public static void convertToCircularDLL(TreeNode root) {
        convertToCDLL(root);
        head.left = prev;
        prev.right = head;
    }



    /**
     * 148.
     * Problem: Maximum Consecutive Increasing Path Length in Binary Tree

     * Solution:
     */



    /**
     * 149.
     * Problem: Binary Indexed Tree : Range Updates and Point Queries

     * Solution:
     */



    /**
     * 150.
     * Problem: Flip Binary Tree

     * Solution:
     */




    /**
     * 151.
     * Problem: Longest consecutive sequence in Binary tree
     * Given a Binary Tree find the length of the longest path which comprises of nodes with consecutive values in increasing order.
     * Every node is considered as a path of length 1.

     * Solution: We can solve above problem recursively. At each node we need information of its parent node,
     * if current node has value one more than its parent node then it makes a consecutive path, at each node
     * we will compare node’s value with its parent value and update the longest consecutive path accordingly.
     * For getting the value of parent node, we will pass the (node_value + 1) as an argument to the recursive method
     * and compare the node value with this argument value, if satisfies, update the current length of consecutive path
     * otherwise reinitialize current path length by 1.
     */
    public static void findLCP(TreeNode root, int currLCP, int parentValue, int[] lcp) {
        if (root == null) return;
        if (parentValue + 1 == root.data) currLCP++;
        else currLCP = 1;
        lcp[0] = Math.max(currLCP, lcp[0]);
        findLCP(root.left, currLCP, root.data, lcp);
        findLCP(root.right, currLCP, root.data, lcp);
    }

    public static int findLCP(TreeNode root) {
        if (root == null) return 0;
        int[] lcp = new int[1];
        findLCP(root, 0, root.data - 1, lcp);
        return lcp[0];

    }

    /**
     * 152.
     * Problem: Swap Nodes in Binary tree of every k’th level

     * Solution:
     */


    /**
     * 153.
     * Problem: Check if there is a root to leaf path with given sequence
     * Given a binary tree and an array, the task is to find if the given array sequence is present as a root to leaf path in given tree.
     * Solution:
     */
    public static boolean compareNodes(TreeNode root, int[] array, int index) {
        if (index >= array.length) return false;
        else return root.data == array[index];
    }

    public static boolean existPath(TreeNode root, int[] array, int start) {
        if (root == null) return array.length == start;
        else return compareNodes(root, array, start) &&
                existPath(root.left, array, start + 1) ||
                existPath(root.right, array, start + 1);
    }






    public static void main(String[] args) {
       TreeNode root = new TreeNode(20);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(49);
//        root.left.right = new TreeNode(12);
//        root.left.left = new TreeNode(5);
//        root.right.left = new TreeNode(23);
//        root.right.right = new TreeNode(52);
//        root.left.right.right = new TreeNode(12);
//        root.right.right.left = new TreeNode(50);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(1);
        int[] arr = {20, 22, 25};
        System.out.print(existPath(root, arr, 0));
//        bottomView(root);
//        int res = findAmplitude(root, new ArrayList<Integer>());
//        System.out.print(res);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(6);
//        root.right.right.left = new TreeNode(7);
//        convertToCircularDLL(root);
//        System.out.print(minSteps(0, 10, 0));
//        printExtremeNodesAlt(root);
//        System.out.print(getLevel(root, 7, 1));
//        printNodesAtKdistance(root, 0);
//        printRootToPaths(root, "");
    }



}
