import java.util.Scanner;

public class Keyboard {

  public String getInput () {

    Scanner input = new Scanner(System.in);
    String nextString = input.nextLine();
    return nextString;

  }

}
