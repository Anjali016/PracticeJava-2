package recursion;
/*
*
*  1 1 1 1
*        1
  *      1
  *
  *
* */


public class PowerSet {

    public  static void subset(String sofar, String rem) {
        if (rem.length() == 0) System.out.println(sofar);
        else {
            subset(sofar + rem.charAt(0), rem.substring(1));
            subset(sofar, rem.substring(1));
        }
    }

    public static void main(String[] args) {
        subset("","abcdef");
    }
}
