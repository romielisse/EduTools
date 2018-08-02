public class Task
{
  public static void main( String[] args )
  {
    int a, b;
    double x, y, z;
    String one, two, red, blue;

    a = 5;
    b = 10;

    System.out.println( "a is " + a + ", b is " + b );
    System.out.println( "a + b is " + Add(a,b) );
    System.out.println( "a - b is " + Subtract(a,b) );
    System.out.println( "a * b is " + Multiply(a,b) );
    System.out.println( "a / b is " + DivideAB(a,b) );
    System.out.println( "b / a is " + DivideBA(a,b) );
    System.out.println( "a % b is " + RemainderAB(a,b) );

    System.out.printf(printWithPlaceHolder("one","two","red","blue"));
  }

  public static int Add(int a, int b) {
    return a + b;
  }

  public static int Subtract(int a, int b) {
    return a - b;
  }

  public static int Multiply(int a, int b) {
    return a * b;
  }

  public static float DivideAB(int a, int b) {
    try {
      return a / b;
    }
    // Return 0 if dividing by 0
    catch(Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

  public static float DivideBA(int a, int b) {
    try {
      return b / a;
    }
    catch(Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

  public static int RemainderAB(int a, int b) {
    return a % b;
  }

  public static String printWithPlaceHolder(String s1, String s2, String s3, String s4) {
    return s1 + " fish " + s2 + " fish " + s3 + " fish " + s4 + " fish ";
  }
}