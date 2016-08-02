package recursion;

public class Palindrome {
    public boolean isPalindrome(String str) {
        if (str.length() < 2) return true;
        else
            return str.charAt(0) == str.charAt(str.length()-1) && isPalindrome(str.substring(1,str.length()-2));
    }
}
