import java.io.Console;

public class GradeQuery {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What grade did you get on your last test? (A, B, C, D, or F)");
    String userGrade = console.readLine();
    userGrade = userGrade.toUpperCase();

    // System.out.println("input: " + userGrade);

    if ( userGrade.equals("A") || userGrade.equals("B") ) {
      System.out.println("Keep up the good work, nerd!");
    } else if ( userGrade.equals("C") ) {
      System.out.println("You should study a little harder next time!");
    } else {
      System.out.println("Get your ass in gear, stupid!");
    }
  }
}
