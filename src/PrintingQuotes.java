

public class PrintingQuotes {

  public void printingQuotes () {

    System.out.println("\n\n");
    Keyboard keyboard = new Keyboard();
    System.out.println("What is the quote?");
    String quote = keyboard.getInput();
    System.out.println("Who said it?");
    String name = keyboard.getInput();
    System.out.println(name + " says, \"" + quote + ".\"");
    System.out.println("\n\n");

  }

}
