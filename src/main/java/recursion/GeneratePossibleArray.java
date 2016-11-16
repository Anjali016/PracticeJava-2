package recursion;

import java.util.ArrayList;

/*
*
*           10 15 25
*           1 5 20 30
             *     10 20 ////
             *
             *
             *
             *
             *
             *
             *
             *
             *
             *
             *
             *           10    20   25
*                                   /    \
*                                 20     30
  *                              /
     *                         25
          *                   /
                *           30
* */
public class GeneratePossibleArray {

    public static void generate(int[] arr1, int[] arr2, ArrayList<Integer> sofar, boolean flag) {

       // if( > arr1.length - 1 &&  > arr2.length) return;
        if(flag) {
            for (int choice : arr1){
                if (sofar.isEmpty() || sofar.get(sofar.size() - 1) < choice) {
                    sofar.add(choice);
                    generate(arr1, arr2, sofar,!flag);
                    sofar.remove(sofar.size()-1);
                }
            }
        }else {
               for (int choice: arr2){
                if (sofar.isEmpty() || sofar.get(sofar.size() - 1) < choice) {
                    sofar.add(choice);
                    for (int n : sofar) System.out.print(n);
                    System.out.println();
                    generate(arr1, arr2, sofar, !flag);
                    sofar.remove(sofar.size()-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 15};
        int[] arr2 = {1, 5, 20, 30};
        generate(arr1, arr2, new ArrayList<Integer>(), true);
    }
}
