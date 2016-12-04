public class Test {

    static int index = 0;
    static int startIndex = 0;
    static int length = 0;
    static int maxLength = 0;

    public static int maxSum(int[] array) {
        int currentMax = array[0];
        int maxSoFar = array[0];
        length++;
        for (int i = 1; i < array.length; i++) {
            if (currentMax + array[i] > array[i]) {
                currentMax += array[i];
                length++;
            }
            else {
                currentMax = array[i];
                index = i;
                length = 1;
            }
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
                startIndex = index;
                maxLength = length;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] a = {1,-3,5,10};
        int mSum = maxSum(a);
        System.out.println("max sum = " + mSum);
        System.out.println("start index = " + startIndex);
        System.out.println("length = "+maxLength);

        startIndex = 0;
        length = 0;
        int[] a1 = {1,-3,5,-4};
        int mSum1 = maxSum(a1);
        System.out.println("max sum = " + mSum1);
        System.out.println("start index = " + startIndex);
        System.out.println("length = "+maxLength);

        startIndex = 0;
        length = 0;
        int[] a2 = {5,-3,5,-4};
        int mSum2 = maxSum(a2);
        System.out.println("max sum = " + mSum2);
        System.out.println("start index = " + startIndex);
        System.out.println("length = "+maxLength);

    }



}
