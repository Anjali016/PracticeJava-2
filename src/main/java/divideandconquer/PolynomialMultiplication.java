package divideandconquer;

public class PolynomialMultiplication {
    // Naive Algorithm
    public static int[] polyMultiplication(int[] poly1, int[] poly2, int n) {

        int[] product = new int[2 * n - 1];

        for (int i = 0; i < poly1.length; i++) {
            for (int j = 0; j < poly2.length; j++) {
                product[i + j] +=  poly1[i] * poly2[j];
            }
        }
        return product;
    }

    public static void main(String[] args) {

        int[] poly1 = {3, 2, 5};
        int[] poly2 = {5, 1, 2};

        int[] product = polyMultiplication(poly1, poly2, poly1.length);

        for (int n : product) System.out.print(n +" ");
    }
}
