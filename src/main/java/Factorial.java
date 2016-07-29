/**
 * Created by abhay on 24/07/16.
 */
public class Factorial {

    public int fact(int x) {
        if (x == 0) return 1;
        else return x*fact(x-1);
    }
}
