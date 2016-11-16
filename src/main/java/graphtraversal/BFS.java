package graphtraversal;

import java.util.*;

import static graphtraversal.DFS.dfs;
import static graphtraversal.TopologicalSort.topologicalSort;

public class BFS {

    public static void bfs(Map<GraphNode,LinkedList<GraphNode>> graph, GraphNode source) {

        Queue<GraphNode> queue = new LinkedList();
        source.distance = 0;
        queue.add(source);

        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();

            for (GraphNode node : graph.get(current)) {
                if(node.distance == Integer.MIN_VALUE) {
                    node.distance = current.distance + 1;
                    node.parent = current;
                    queue.add(node);
                }
            }
        }



    }

    public static void main(String[] args) {

        Map<GraphNode, LinkedList<GraphNode>> graph = new LinkedHashMap<GraphNode, LinkedList<GraphNode>>();
        GraphNode a = new GraphNode('0');
        GraphNode b = new GraphNode('1');
        GraphNode c = new GraphNode('2');
        GraphNode d = new GraphNode('3');
        GraphNode e = new GraphNode('4');
        GraphNode f = new GraphNode('5');

        graph.put(a, new LinkedList<GraphNode>());
        graph.put(b, new LinkedList<GraphNode>());
        graph.put(c, new LinkedList<GraphNode>());
        graph.put(d, new LinkedList<GraphNode>());
        graph.put(e, new LinkedList<GraphNode>());
        graph.put(f, new LinkedList<GraphNode>());

        graph.get(f).add(a);
        graph.get(f).add(c);
        graph.get(e).add(a);
        graph.get(e).add(b);
        graph.get(c).add(d);
        graph.get(d).add(b);

        topologicalSort(graph);
       // bfs(graph, b);
        //System.out.print(h.parent.ch);
        //dfs(graph);
    }
}
