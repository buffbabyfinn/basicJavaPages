import java.io.Console;

public class Friends {
  public static void main(String[] args) {
    String[] myFriendsList = {"Erin", "Kamran", "Dick", "James", "Drake"};

    System.out.println("My friends are: ");
      for(String friend : myFriendsList) {
        System.out.println(friend);
      }
  }
}
