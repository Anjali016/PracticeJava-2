package greedy;

import java.util.*;

public class MaximizeSalary {

    public static int maximize(List<String> numbers) {

        Collections.sort(numbers, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String firstNum = o1 + o2;
                String secondNum = o2 + o1;

                int res = firstNum.compareTo(secondNum);

                return -res;

            }
        });


        for (String num : numbers) System.out.print(num);

        return 0;
    }

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<String>();

        numbers.add("2");
        numbers.add("1");
        //numbers.add("100");

        //System.out.print("12".compareTo("212"));
        maximize(numbers);
    }

}

