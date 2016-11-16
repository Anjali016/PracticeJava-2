package recursion;

public class PalindromNumber {

    public boolean isPalindrome(int n){

        return n == reverseNumber(n, 0);
    }

    public int reverseNumber(int n, int acc) {

        if(n == 0) return acc;
        return reverseNumber(n / 10, acc *10 + n % 10);
    }

}
