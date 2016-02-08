import java.io.Console;

public class AlcoholTest {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("How old are you?");
    String stringUserAge = console.readLine();
    Integer integerUserAge = Integer.parseInt(stringUserAge);

      if(integerUserAge >= 21) {
        System.out.println("You are old enough to imbibe.");
      } else {
        System.out.println("Looks like it's juice for you.");
      }
  }
}
