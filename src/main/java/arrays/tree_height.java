package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class tree_height {
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public class TreeHeight {
        int n;
        int parent[];

        void read() throws IOException {
            FastScanner in = new FastScanner();
            n = in.nextInt();
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = in.nextInt();
            }
        }

        void fillDepth(int node, int[] depth) {

            if (depth[node] != 0)
                return;
            if (parent[node] == -1) {
                depth[node] = 1;
                return;
            }
            if (depth[node] == 0)
                fillDepth(parent[node], depth);

            depth[node] = 1 + depth[parent[node]];


        }

        int computeHeight() {
            // Replace this code with a faster implementation
            int[] depth = new int[n];

            for (int i = 0; i < n; i++)
                fillDepth(i, depth);

            int maxHeight = 0;

            for (int height : depth) {
                if (maxHeight < height) maxHeight = height;
            }

            return maxHeight;
        }

    }
        static public void main(String[] args) throws IOException {
            new Thread(null, new Runnable() {
                public void run() {
                    try {
                        new tree_height().run();
                    } catch (IOException e) {
                    }
                }
            }, "1", 1 << 26).start();
        }

        public void run() throws IOException {
            TreeHeight tree = new TreeHeight();
            tree.read();
            System.out.println(tree.computeHeight());
        }
}



