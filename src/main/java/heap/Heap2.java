package heap;

public class Heap2 {

    static int maxSize = 10;
    static int size ;

    public static void printHeap(int[] arr) {

        for (int i = 0; i < maxSize; i++)
            System.out.print(arr[i] + " ");
    }

    public static int parent(int x) {
        return (x - 1) / 2;
    }

    public static int leftChild(int x) {
        return 2 * x + 1;
    }

    public static int rightChild(int x) {
        return 2 * x + 2;
    }

    public static void buildHeap(int[] arr) {

        for (int i = size / 2 - 1; i >=0; i--) {

            slideDown(arr, i);
        }
    }

    public static void swapElement(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int extractMax(int[] heap) {

        int result = heap[0];
        swapElement(heap, 0, size - 1);
        size--;
        slideDown(heap, 0);
        return result;
    }

    public static void slideDown(int[] arr, int x) {

        int maximum = x;
        int leftChild = 2 * x + 1;
        int rightChild = 2 * x + 2;

        if (leftChild < size && arr[leftChild] > arr[maximum])
            maximum = leftChild;
        if (rightChild < size && arr[rightChild] > arr[maximum])
            maximum = rightChild;
        if (x != maximum) {
            swapElement(arr, x, maximum);
            slideDown(arr, maximum);
        }
    }
/*
*
*
*
*                 10
*               /     \
*              6       5
*            /   \    /
*           2     1   3
*
*
*
*
*
* */
    public static void slideUp(int[] arr, int x) {

        while (size > x && x > 0 && arr[x] > arr[parent(x)]) {

            swapElement(arr, x, parent(x));
            x = parent(x);
        }
    }

    public static void insert(int[] heap, int x) {

        if (maxSize == size) {
            System.out.print("Heap OverFlow");
        }else {

            heap[size++] = x;
            slideUp(heap, size - 1);
        }

    }

    public static void main(String[] args ) {


        int[] arr = new int[maxSize];
        arr[0] = 5;
        arr[1] = 1;
        arr[2] = 6;
        arr[3] = 2;
        arr[4] = 3;
        size = 0;
        int[] heap = new int[maxSize];
        for (int i = 0; i < 5 ; i++) insert(heap, arr[i]);
        System.out.println(size);
        for (int i = size - 1; i >=0; i--) {

            heap[i] = extractMax(heap);
        }
        //buildHeap(arr);
      //  insert(arr, 10);
//        System.out.println(extractMax());
//        System.out.println(extractMax(arr));
//        System.out.println(extractMax(arr));
//        System.out.println(extractMax(arr));
        printHeap(heap);

    }
}
