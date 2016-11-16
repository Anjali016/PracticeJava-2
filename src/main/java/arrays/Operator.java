package arrays;

public class Operator {

    public static int func(int akshayAge , int ayushAge) {

        int result = (akshayAge > ayushAge) ?  akshayAge: ayushAge;

        return  Math.max(akshayAge, ayushAge);
        //return -result * akshayAge;
    }
    public static void main(String[] args) {

        System.out.print(func(14, 16));
    }
}
