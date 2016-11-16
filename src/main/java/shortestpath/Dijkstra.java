package shortestpath;

import graphtraversal.GraphNode;


import java.util.*;

public class Dijkstra {

    public static void dijkstra(Map<GraphNode, LinkedList<GraphNode>> graph, GraphNode source, GraphNode target, Map<String, Integer> weights) {

        PriorityQueue<GraphNode> priorityQueue = new PriorityQueue<GraphNode>(new Comparator<GraphNode>() {
            public int compare(GraphNode o1, GraphNode o2) {
                return o1.distance - o2.distance;
            }
        });

        Map<GraphNode, GraphNode> prev = new HashMap<GraphNode, GraphNode>();

        for (GraphNode node: graph.keySet()) {
            if(source == node)
                node.distance = 0;
            else
                node.distance = Integer.MAX_VALUE;
            priorityQueue.add(node);
        }

        while (!priorityQueue.isEmpty()) {
            GraphNode u = priorityQueue.poll();

            for (GraphNode v : graph.get(u)) {
                String edge = String.valueOf(u.ch) + String.valueOf(v.ch);
                int alt = u.distance + weights.get(edge);
                if (alt < v.distance) {
                    v.distance = alt;
                    prev.put(v, u);
                }
            }
        }
        shortestPath(prev, target, source);
    }

    public static void shortestPath(Map<GraphNode, GraphNode> prev, GraphNode target, GraphNode source) {

        Stack<GraphNode> path = new Stack<GraphNode>();
        path.add(target);
        GraphNode temp  = prev.get(target);

        while (temp != source) {
            path.add(temp);
            temp = prev.get(temp);
        }

        path.add(source);

        while (!path.isEmpty()) {
            System.out.print(path.pop().ch);
        }

    }

    public static void main(String[] args) {
        Map<GraphNode, LinkedList<GraphNode>> graph = new LinkedHashMap<GraphNode, LinkedList<GraphNode>>();
        GraphNode a = new GraphNode('0');
        GraphNode b = new GraphNode('1');
        GraphNode c = new GraphNode('2');
        GraphNode d = new GraphNode('3');
        Map<String, Integer> weights = new HashMap<String, Integer>();
        weights.put("01", 4);
        weights.put("02", 3);
        weights.put("23", 7);
        weights.put("13", 1);
//        GraphNode e = new GraphNode('4');
//        GraphNode f = new GraphNode('5');

        graph.put(a, new LinkedList<GraphNode>());
        graph.put(b, new LinkedList<GraphNode>());
        graph.put(c, new LinkedList<GraphNode>());
        graph.put(d, new LinkedList<GraphNode>());
//        graph.put(e, new LinkedList<GraphNode>());
//        graph.put(f, new LinkedList<GraphNode>());

        graph.get(a).add(b);
        graph.get(a).add(c);
        graph.get(b).add(d);
        graph.get(c).add(d);

        dijkstra(graph, a, d, weights);
    }
}
