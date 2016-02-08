import java.io.Console;

public class Potluck {
  public static void main(String[] args) {
    Console console = System.console();

      System.out.println("What is your first name?");
      String stringUserName = console.readLine();
      Integer userNumber = stringUserName.compareTo("N");

        if(userNumber < 0) {
        System.out.println("You should bring apples.");
      } else if(userNumber == 0) {
        System.out.println("You should bring beef steaks.");
      } else if(userNumber > 0 && userNumber < 13) {
        System.out.println("You should bring beer. And lots of it.");
      } else {
        System.out.println("You should stay home.");
      }
  }
}
