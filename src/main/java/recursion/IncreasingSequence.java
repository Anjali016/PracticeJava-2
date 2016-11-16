package recursion;

import java.util.ArrayList;

/*
*
*
* */
public class IncreasingSequence {

    public static void printIncreasing(String sofar, ArrayList<Integer> arr) {

        if (arr.isEmpty()) System.out.print(sofar + " ") ;
        else {
            int current = arr.remove(0);
            ArrayList<Integer> newChoice = new ArrayList<Integer>();
            for (int n: arr ) {
                if (n > current) newChoice.add(n);
            }
            printIncreasing(sofar + current, newChoice);
            printIncreasing(sofar, arr);
        }
    }

    public static void printContigous(String sofar, ArrayList<Integer> rest) {

        if (rest.isEmpty()) System.out.print(sofar + " ");
        else {
            int current = rest.remove(0);
            ArrayList<Integer> newChoice = new ArrayList<Integer>();


        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,6,5};
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(4);
        printIncreasing("", a);
    }
}
