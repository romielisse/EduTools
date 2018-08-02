import org.junit.Test;
import static org.junit.Assert.*;

public class IsPalindromeTest {
    @Test
    public void testSolution(){
        assertTrue("", Task.isPalindrome("Anna") == true);
        assertTrue("", Task.isPalindrome("Civic") == true);
        assertTrue("", Task.isPalindrome("A man a plan a canal Panama") == true);
        assertTrue("", Task.isPalindrome("cat") == false);
        assertTrue("", Task.isPalindrome("star") == false);
    }
}