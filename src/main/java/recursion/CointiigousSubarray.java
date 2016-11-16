package recursion;

public class CointiigousSubarray {

    public static void printContigous(String sofar, String rest, int start) {

        if(rest.isEmpty()) System.out.println(sofar);
        else {
            for (int i = 0; i < rest.length(); i++) {
                printContigous(sofar + rest.charAt(i), rest.substring(i + 1), i+ 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        String rem = "12";
        printContigous("", rem ,0);
    }
}
