package graphtraversal;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
/*
*
*               1
*              / \
*             5     2
*                   \
*                    3
* */

public class LongestPathInTree {

    static int farthestNode;
    public static void longestPath(int root, Map<Integer, LinkedList<Integer>> graph, int level, boolean[] isVisited, int[] maxLevel) {

        isVisited[root] = true;
        for (int child : graph.get(root)) {

            if (!isVisited[child]) {
                if(maxLevel[0] < level + 1 ) {
                    farthestNode = child;
                    maxLevel[0] = level + 1;
                }
                longestPath(child, graph, level + 1, isVisited, maxLevel);
            }
        }
    }
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        Graph graph = new Graph();
        int nodes = in.nextInt();
        boolean[] isVisited = new boolean[nodes + 1];
        int[] maxLevel = new int[1];
        for (int i = 0 ; i < nodes - 1; i++){

            graph.add(in.nextInt(), in.nextInt());
        }
        farthestNode = -1;
        longestPath(1, graph.graph, 0, isVisited, maxLevel);
        isVisited = new boolean[nodes + 1];
        maxLevel[0] = 0;
        longestPath(farthestNode, graph.graph, 0, isVisited, maxLevel);
        System.out.print(maxLevel[0]);
        farthestNode = -1;

    }
}
