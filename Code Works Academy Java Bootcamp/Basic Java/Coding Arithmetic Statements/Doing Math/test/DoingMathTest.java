import org.junit.Test;
import static org.junit.Assert.*;

public class DoingMathTest {
    @Test
  public void testSolution(){
      assertTrue("", Task.Add(1,2) == 3);
      assertTrue("", Task.Add(1,6) == 7);

      assertTrue("", Task.Subtract(1,2) == -1);
      assertTrue("", Task.Subtract(1,6) == -5);

      assertTrue("", Task.Multiply(1,2) == 2);
      assertTrue("", Task.Multiply(1,6) == 6);

      assertTrue("", Task.DivideAB(1,2) == 0.5);
      assertTrue("", Task.DivideAB(1,0) == 0);

      assertTrue("", Task.DivideBA(1,2) == 2);
      assertTrue("", Task.DivideBA(0,1) == 0);

      assertTrue("", Task.RemainderAB(27,5) == 2);
      assertTrue("", Task.RemainderAB(10,3) == 1);

      assertTrue("", Task.RemainderAB(27,5) == 2);
      assertTrue("", Task.RemainderAB(10,3) == 1);

    }
}