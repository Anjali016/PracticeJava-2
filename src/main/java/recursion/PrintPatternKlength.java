package recursion;

import java.awt.*;

public class PrintPatternKlength {

    public static void print(String choices, String sofar, int k) {
        if (k == 0){
            System.out.println(sofar);
        }else {
            for (Character choice : choices.toCharArray()){
                print(choices, sofar+choice, k-1);
            }
        }
    }

    public static void main(String[] args) {

        print("ab", "", 3);
    }
}
