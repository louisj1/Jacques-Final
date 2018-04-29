

public class Catch {

  public static void doCatchDemo() {

    System.out.println("Enter Airport(J)");
    methodA();
    System.out.println("Exit Airport()");
  }

  public static void methodA() {
    System.out.println("Buckle your seatbelt()");
    try {
      System.out.println(1 / 1);
      // If divided-by-0, it triggers an ArithmeticException
      // an unchecked exception
      // This method does not catch ArithmeticException
      // It runs the "finally" and popped off the call stack
    } finally {

      System.out.println("Exit Plane()");
    }
    System.out.println("Grab your belongings()");
  }
}