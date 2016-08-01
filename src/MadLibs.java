/*******************************************************************************
**
**
**              Name: Blaine Harris
**              Project: ExercisesForProgrammers
**              File: MadLibs.java
**              Date: 08/01/16
**              Language: java
**
**
**
/******************************************************************************/

public class MadLibs {

  public void madLibs () {

    System.out.println("\n\n");
    Keyboard keyboard = new Keyboard();
    System.out.print("Enter a noun: ");
    String noun = keyboard.getInput();
    System.out.print("Enter a verb: ");
    String verb = keyboard.getInput();
    System.out.print("Enter an adjective: ");
    String adjective = keyboard.getInput();
    System.out.print("Enter an adverb: ");
    String adverb = keyboard.getInput();

    System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb));
    System.out.println("\n\n");

  }

}
