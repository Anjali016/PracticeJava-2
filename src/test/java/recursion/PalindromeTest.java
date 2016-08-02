package recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    @Test
    public void palindromeTest() {
        Palindrome palindrome = new Palindrome();
        assertEquals(true, palindrome.isPalindrome("ABA"));
    }
}
