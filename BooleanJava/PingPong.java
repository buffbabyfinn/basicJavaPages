import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a number:");
    String stringNumber = console.readLine();
    Integer integerNumber = Integer.parseInt(stringNumber);

    for(Integer i = 1; i <= integerNumber; i++) {   // count from 1 to user input
    if (((i % 3) == 0) && ((i % 5) == 0)) {  // A multiple of both?
      System.out.println("pingpong");
    } else if ((i % 3) == 0) {
      System.out.println("ping"); // else a multiple of 3?
    } else if ((i % 5) == 0) {
    System.out.println("pong"); // else a multiple of 5?
    } else {
    System.out.println(i);
    }                        // else just print it
    System.out.println(" ");
    }
  }
}
