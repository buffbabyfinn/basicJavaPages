import java.io.Console;

public class Clothing {
  public static void main(String[] args) {
    Console console = System.console();

      System.out.println("What is the current temperature?");
      String stringUserTemp = console.readLine();
      Integer integerUserTemp = Integer.parseInt(stringUserTemp);

        if(integerUserTemp <= 20) {
        System.out.println("You should wear a ton of layers. Like, seriously, a lot of layers.");
      } else if(integerUserTemp > 20 && integerUserTemp <= 50 ) {
        System.out.println("You should wear a jacket today, and perhaps a hat too.");
      } else if(integerUserTemp > 50 && integerUserTemp <= 70) {
        System.out.println("Wear a t-shirt and jeans today.");
      } else {
        System.out.println("Light clothing should be fine today.");
      }
  }
}
