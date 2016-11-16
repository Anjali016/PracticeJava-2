package graphtraversal;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianOfStream {

    public static void balanceHeaps(PriorityQueue maxHeap, PriorityQueue minHeap) {

        if (maxHeap.size() > minHeap.size())
            minHeap.add(maxHeap.poll());
        else
            maxHeap.add(minHeap.poll());
    }

    public static void getMedian(int[] stream) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int first = stream[0];
        int second = stream[1];

        if (first < second) {
            minHeap.add(second);
            maxHeap.add(first);
        }else {
            minHeap.add(first);
            maxHeap.add(second);
        }

        for (int i = 2; i < stream.length; i++) {

            if (maxHeap.peek() > stream[i])
                maxHeap.add(stream[i]);
            else
                minHeap.add(stream[i]);

            if (Math.abs(maxHeap.size() - minHeap.size()) > 1)
                balanceHeaps(maxHeap, minHeap);

            System.out.println(median(maxHeap, minHeap));
        }
    }

    public static float median(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {

        if (maxHeap.size() == minHeap.size()) {
            float one = maxHeap.peek();
            float second =  minHeap.peek();
            return (one + second) / 2;
        }
        else if(maxHeap.size() > minHeap.size()) return maxHeap.peek();
        else return minHeap.peek();
    }


    public static void main(String[] args) {

        int[] stream = {1, 2, 3, 4, 5, 6, 7, 8};

        getMedian(stream);

    }



}
