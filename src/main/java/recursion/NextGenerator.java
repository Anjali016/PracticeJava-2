package recursion;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NextGenerator {
    static PriorityQueue<Integer> priorityQueue ;
    public static void solve(String sofar, String rem, int num) {
        priorityQueue = new PriorityQueue<Integer>();
        printNextGenerator(sofar, rem, num);
        if(priorityQueue.isEmpty()) System.out.println("not possible");
        else System.out.println(priorityQueue.poll());

    }
    public static void printNextGenerator(String sofar, String rem, int num) {

        if(rem.compareTo("") == 0) {
            if(Integer.valueOf(sofar) > num)
                 priorityQueue.add(Integer.valueOf(sofar));
        }
        else {
            for (int i = 0; i < rem.length(); i++){
                printNextGenerator(sofar + rem.charAt(i), rem.substring(0, i) + rem.substring(i+1), num);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            int num = in.nextInt();
            solve("", String.valueOf(num), num);
        }


    }

}
