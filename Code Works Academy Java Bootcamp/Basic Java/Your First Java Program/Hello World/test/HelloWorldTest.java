import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

  @Test
  public void testSolution() {
    assertEquals("You should say hello to the world", "Hello " +
            "World!", Task
            .sayHello());
    assertEquals("You should print 'My name is Alton'", "My name is Alton.", Task.printName());
  }
}