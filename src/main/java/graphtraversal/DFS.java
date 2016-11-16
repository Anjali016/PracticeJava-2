package graphtraversal;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class DFS {

    public static void dfs(Map<GraphNode, LinkedList<GraphNode>> graph, GraphNode source) {

        if (!source.isVisited) {
            source.isVisited = true;
            System.out.print(source.ch + " ");
        }

            for (GraphNode node : graph.get(source)) {
              //  if (node.isVisited) System.out.print("Found Cycle");
                if (!node.isVisited)
                    dfs(graph, node);
            }
        }

    // Dfs for disconnected graph

    public static void dfs(Map<GraphNode, LinkedList<GraphNode>> graph) {

        for (GraphNode node: graph.keySet()) {
            if (!node.isVisited) {
                dfs(graph, node);
            }
        }
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a + b);
    }

}

