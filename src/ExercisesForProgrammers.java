/*******************************************************************************
**
**
**              Name: Blaine Harris
**              Project: ExercisesForProgrammers
**              File: ExercisesForProgrammers.java
**              Date: 08/01/16
**              Language: java
**
**
**
/******************************************************************************/

import java.util.Scanner;


/**
 *ExercisesForProgrammers.java is the main entry point for the program. The user
 *is prompted to choose an option, and the resulting class is called.
 */

public class ExercisesForProgrammers {

  public static void main (String[] args){

    //A keyboard object is created to retrieve input from user.
    Keyboard keyboard = new Keyboard();

    //Variables to hold the user input.
    String nextIntStr;
    int choice;

    //Do-while loop runs when choice != 0.
    do{

      //Display the options for the user.
      System.out.print("Please choose which program you would like to run. [0] to exit. \n"
                          + "[1] Saying Hello\n"
                          + "[2] Counting the Number of Characters\n"
                          + "[3] Printing Quotes\n"
                          + "[4] Mad Lib\n"
                          + "[5] Simple Math\n"
                          + "[6] Retirement Calculator\n"
                          + "[7] Area of a Rectangular Room\n");

      nextIntStr = keyboard.getInput();
      choice = Integer.parseInt(nextIntStr);

      //Switch determines the program to run based on the user's choice.
      switch(choice) {

                        case 1:
                          SayingHello sh = new SayingHello();
                          sh.sayingHello();
                          break;
                        case 2:
                          CountingCharacters cc = new CountingCharacters();
                          cc.countingCharacters();
                          break;
                        case 3:
                          PrintingQuotes pq = new PrintingQuotes();
                          pq.printingQuotes();
                          break;
                        case 4:
                          MadLibs ml = new MadLibs();
                          ml.madLibs();
                          break;
                        case 5:
                          SimpleMath sm = new SimpleMath();
                          sm.simpleMath();
                          break;
                        case 6:
                          RetirementCalculator rc = new RetirementCalculator();
                          rc.retirementCalculator();
                          break;
                        case 7:
                          AreaOfARectangularRoom aoarc = new AreaOfARectangularRoom();
                          aoarc.getArea();
                          break;
      }

    }while(choice != 0);

    return;
  }

}
