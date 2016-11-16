package divideandconquer;

public class MajorityElement {

    public static int majorityElement(int[] array, int left, int right) {

        if (left == right) return array[left];

        int mid = left + (right - left) /2;

        int leftMajority = majorityElement(array, left, mid);
        int rightMajority = majorityElement(array, mid + 1, right);

        return checkMajority(array, left, right, mid,leftMajority, rightMajority);

    }

    public static int getMajority(int[] arr) {

        if (majorityElement(arr, 0, arr.length - 1) == -1) return 0;
        else return -1;
    }

    public static int checkMajority(int arr[], int left, int right, int mid, int leftMajority, int rightMajority) {

        int lM = 0;
        int rM = 0;
        int n = right - left + 1;
        for (int i = left; i <= right; i++) {
              if(leftMajority == arr[i]) lM++;
              if(rightMajority == arr[i]) rM++;
        }
        if (n / 2 < lM) return leftMajority;
        else if (n / 2 < rM) return rightMajority;
        else return -1;

    }


    private static int getMajorityElement(int[] a, int left, int right) {
      /*  if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }*/

        return majorityElement(a, left, right - 1);

        //write your code here
        // return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 1};

        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
