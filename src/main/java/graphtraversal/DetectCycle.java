package graphtraversal;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class DetectCycle {

    public static boolean isCycleHelper(int vertex, Map<Integer, LinkedList<Integer>> graph, boolean[] visited, int parent) {

        visited[vertex] = true;
        for (int child : graph.get(vertex)) {
            if(!visited[child])
                isCycleHelper(child, graph, visited, vertex);
            else if(child != parent)
                return true;
        }

        return false;
    }

    public static boolean isConnected(Map<Integer, LinkedList<Integer>> graph, boolean[] isVisited) {

        for (int vertex : graph.keySet()) {

            if(!isVisited[vertex])
                return false;
        }
        return true;

    }
    public static boolean AcycleandConnected(Map<Integer, LinkedList<Integer>> graph, boolean[] visted) {

        return (!(isCycleHelper(1, graph, visted, -1)) && (isConnected(graph, visted)));

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vertex = in.nextInt();
          int edges =  in.nextInt();
        boolean[] visited = new boolean[vertex + 1];
        Graph graph = new Graph();
        for (int i = 0 ; i < edges; i++ ){
            graph.add(in.nextInt(), in.nextInt());
        }


        if (AcycleandConnected(graph.graph, visited)) System.out.print("YES");
        else System.out.print("NO");

    }
}
