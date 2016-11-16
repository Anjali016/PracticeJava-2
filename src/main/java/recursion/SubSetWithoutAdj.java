package recursion;

public class SubSetWithoutAdj {
    static int count = 0;
    public static void subSetWithoutAdj(String sofar, String rem) {

        if(rem.length() == 0) {

            System.out.println(count++ +sofar);
        }
        else {
            String next;
            if(rem.length() < 2)  next = "";
            else next = rem.substring(2);
            subSetWithoutAdj(sofar + rem.charAt(0), next);
            subSetWithoutAdj(sofar, rem.substring(1));
        }
    }

    public static void main(String[] args) {
        subSetWithoutAdj("","abcd");
    }
}
