package recursion;

public class Palindrome {

    public static boolean isPal(String str, int left, int right) {
        if(left == right) return true;
        else
            return str.charAt(left) == str.charAt(right) && isPal(str, left + 1, right - 1);
    }
    public boolean isPalindrome(String str) {
        if (str.length() < 2) return true;
        else
            return str.charAt(0) == str.charAt(str.length()-1) && isPalindrome(str.substring(1,str.length()-2));
    }

    public static int longestPalindromeSub(String str, int left, int right) {

        if(left == right) return 1;
        else if(str.charAt(left) == str.charAt(right)) {
            return 2 + longestPalindromeSub(str, left + 1, right - 1);
        }
        else return Math.max(longestPalindromeSub(str, left + 1, right), longestPalindromeSub(str, left, right - 1));
    }

    public static void main(String[ ] args) {

        String str = "turboventilator";
        System.out.print(longestPalindromeSub(str, 0, str.length() - 1));
    }
}
