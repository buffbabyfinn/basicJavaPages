import java.io.Console;

public class ExcitingThings {
  public static void main(String[] args) {
    String[] excitingThingsList = {"art", "coding", "food", "travel"};

    System.out.println("I'm excited about: ");
       for(String excite : excitingThingsList) {
         System.out.println(excite.toUpperCase() + "!");
       }
  }
}
