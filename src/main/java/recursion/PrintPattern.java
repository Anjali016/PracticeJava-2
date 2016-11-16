package recursion;

public class PrintPattern {
    public static void printPattern(int n) {
        if( n <= 0) {
            System.out.print(n+", ");
            return;
        }else {
            System.out.print(n + ", ");
            printPattern(n - 5);
            System.out.print(n + ", ");
        }
    }

    public static void main(String[] args) {
        printPattern(10);

    }


}
