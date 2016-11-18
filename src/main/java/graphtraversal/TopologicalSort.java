package graphtraversal;

import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.jar.Pack200;

import static graphtraversal.DFS.dfs;

public class TopologicalSort {
    static Stack<GraphNode> tSort = new Stack<GraphNode>();
    public static void dfs(Map<GraphNode, LinkedList<GraphNode>> graph, GraphNode current) {

        current.isVisited = true;
        for (GraphNode node : graph.get(current))
            if(!node.isVisited) dfs(graph, node);
        tSort.add(current);
    }

    public static void topologicalSort(Map<GraphNode, LinkedList<GraphNode>> graph) {

        for (GraphNode node : graph.keySet()) {
           if(!node.isVisited)
                dfs(graph, node);
        }

        while (!tSort.isEmpty()) {

            System.out.print(tSort.pop().ch);
        }
    }
}
