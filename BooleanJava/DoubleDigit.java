import java.io.Console;

public class DoubleDigit {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Give me a number.");
    String stringUserNumber = console.readLine();
    Integer integerUserNumber = Integer.parseInt(stringUserNumber);

    if(integerUserNumber >= 10 && integerUserNumber <= 99) {
      System.out.println("This number is a double digit, congratulations!");
    } else {
      System.out.println("Oh snap, this number is not a double digit number.");
    }
  }
}
