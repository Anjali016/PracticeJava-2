package recursion;
/*
*               1       2    3
*            2   3  4   3 4   4
*
*
* */
public class CombinationOfRLength {

    public static void print(int [] arr, String sofar, int r , int s, int e) {

        if( r == 0) {
            System.out.println(sofar);
        }else if(s > e) return;
        else {
            for (int i = s; i < arr.length; i++){
                print(arr, sofar+arr[i], r - 1, i + 1, e);
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        print(arr, "", 3, 0, arr.length-1);
    }
}
