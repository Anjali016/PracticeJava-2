package shortestpath;

public class GraphNode {

        public char ch;
        public int distance;
        public graphtraversal.GraphNode parent;
        boolean isVisited;

        public GraphNode(char ch) {
            this.ch  = ch;
            this.distance = Integer.MAX_VALUE;
            this.parent = null;
            this.isVisited = false;
        }

}
