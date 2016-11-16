package graphtraversal;

import recursion.IncreasingDigits;

public class GraphNode {

   public char ch;
    public int distance;
    public GraphNode parent;
    boolean isVisited;
    public GraphNode(char ch) {
        this.ch  = ch;
        this.distance = Integer.MIN_VALUE;
        this.parent = null;
        this.isVisited = false;
    }
}
