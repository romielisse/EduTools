import org.junit.Test;
import static org.junit.Assert.*;

public class MathTwoTest {
    @Test
    public void testPrintMyNumber() {
      assertTrue("The number passed in should be the one printed out", Task.printMyNumber(2) == 2);
      assertTrue("The number passed in should be the one printed out", Task.printMyNumber(5) == 5);
    }

    @Test
    public void testPrintMyOtherNumber() {
      assertTrue("The number passed in should be the one printed out", Task.printMyOtherNumber(1.7938) == 5);
      assertTrue("The number passed in should be the one printed out", Task.printMyOtherNumber(2.564) == 2.564);
    }

}