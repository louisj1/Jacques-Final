import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author junior927
 *
 */
class Psi { 
  static // Lambda
  LocalDateTime orderDate;


  interface Sayable {

    String say(String message);
  }

  public static void doPsiDemo() {

    // initialize the local time and print
    orderDate = LocalDateTime.now();

    // passing multiple statements in lambda expression
    Sayable person = (message) -> {
      String msg1 = "Today is ";
      String msg3 = " Let's Fly";
      String msg2 = msg1 + message + msg3;
      return msg2;
    };


    // Formatting using local time ISO_LOCAL-DATE
    String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_TIME);
    String fDate1 = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

    System.out.println(person.say(fDate1));
    System.out.println(fDate + (" Time is  precious."));


  }

}