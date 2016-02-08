import java.io.Console;

public class Number {
  public static void main(String[] args){
  Console console = system.console();
  System.out.println("Give me a number!");
  String stringUserNumber = console.readLine();
  Integer integerUserNumber = Integer.parseInt(stringUserNumber);

    Integer output = integerUserNumber;
    if (integerUserNumber <= 0) {
      output = output - 1;
      System.out.println(output);
    } else {
      output += 1;
      System.out.println(output);
    }
