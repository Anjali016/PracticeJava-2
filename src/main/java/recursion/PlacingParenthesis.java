package recursion;

public class PlacingParenthesis {

    public static void printParenthesis(String sofar, String rem) {

        System.out.println( sofar  + "(" + rem +")");

            for (int i = 0; i < rem.length() - 1; i++) {
                printParenthesis( sofar + "(" + rem.substring(0, i + 1) + ")", rem.substring(i + 1));
            }

    }

    public static void main(String[] args) {

        String s = "12";
        printParenthesis("", s);
    }

}
