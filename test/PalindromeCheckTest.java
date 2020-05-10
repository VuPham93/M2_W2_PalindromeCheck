import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {
    @Test
    void testIsPalindrome0() {
        String string = "Level";
        boolean result = PalindromeCheck.isPalindrome(string);

        assertTrue(result);
    }

    @Test
    void testIsPalindrome1() {
        String string = "123454321";
        boolean result = PalindromeCheck.isPalindrome(string);

        assertTrue(result);
    }

    @Test
    void testIsPalindrome2() {
        String string = "I feel bad";
        boolean result = PalindromeCheck.isPalindrome(string);

        assertFalse(result);
    }

    @Test
    void testIsPalindrome3() {
        String string = "Able was I ere I saw Elba";
        boolean result = PalindromeCheck.isPalindrome(string);

        assertTrue(result);
    }

    @Test
    void testIsPalindrome4() {
        String string = "Home Temoh";
        boolean result = PalindromeCheck.isPalindrome(string);

        assertFalse(result);
    }
}