package graphtraversal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {

    Map<Integer, LinkedList<Integer>> graph = new HashMap<Integer, LinkedList<Integer>>();

    public void add(int u, int v) {
        if(graph.get(u) == null) this.graph.put(u, new LinkedList<Integer>());
        if(graph.get(v) == null) this.graph.put(v, new LinkedList<Integer>());
        this.graph.get(u).add(v);
        this.graph.get(v).add(u);
    }

}
