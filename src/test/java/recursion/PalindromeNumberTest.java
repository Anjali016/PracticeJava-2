package recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {
    @Test
    public void palindromeTest() {
        PalindromNumber palindromNumber = new PalindromNumber();
        assertEquals(false, palindromNumber.isPalindrome(122));
    }
}
