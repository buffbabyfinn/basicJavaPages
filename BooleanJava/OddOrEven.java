import java.io.Console;

public class OddOrEven {
public static void main(String[] args) {
  Console console = System.console();

    System.out.println("Please choose a number.");
    String stringUserNumber = console.readLine();
    Integer integerUserNumber = Integer.parseInt(stringUserNumber);

    System.out.println("Here are the numbers prior to yours, listed as even or odd.");

    for(Integer i = 1; i <= integerUserNumber ; i++) {

      // System.out.println(integerUserNumber);
      if((i % 2) == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
      System.out.println();
    }
  }
}
