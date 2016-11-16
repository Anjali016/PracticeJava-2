import sun.awt.image.ImageWatched;

import java.io.FileOutputStream;
import java.util.*;

public class KsortedList {



    public static int taskManager(int[] a, int[] b, int n) {
        HashSet<Integer> dependendies = new HashSet<Integer>();

        for (int i = 0; i < b.length; i++) {

            if (dependendies.contains(a[i])) {

            }else {
                dependendies.add(b[i]);
                n--;
            }

        }
        return n;
    }


    public static void main(String[] args) {

        int[] a = {1, 2};
        int[] b = {2, 1};

        System.out.print(taskManager(a, b, 2));
    }

    class LinkedNode {

        int data;
        LinkedNode next;
        LinkedNode(int d) {
            this.data = d;
            this.next = null;
        }

    }
    public static LinkedNode merge(ArrayList<LinkedNode> sortedLists, int k) {

        LinkedNode head = null;
        LinkedNode tail = head;

        PriorityQueue<LinkedNode> heap = new PriorityQueue<LinkedNode>(new Comparator<LinkedNode>() {
            public int compare(LinkedNode o1, LinkedNode o2) {
                return o1.data - o2.data;
            }
        });

        for (int i = 0; i < k; i++) heap.add(sortedLists.get(i));

        while (!heap.isEmpty()) {

            LinkedNode temp = heap.poll();
            if(temp != null ) {
                LinkedNode nextHead = temp.next;
                if(tail == null) tail = temp;
                else {
                    tail.next = temp;
                    tail = tail.next;
                }

                heap.add(nextHead);
            }
        }

        return head;
    }
}
