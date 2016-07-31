import java.util.Scanner;

public class ExercisesForProgrammers {

  public static void main (String[] args){


    Keyboard keyboard = new Keyboard();
    String nextIntStr;
    int choice;


    do{

      System.out.print("Please choose which program you would like to run. [0] to exit. \n"
                          + "[1] Saying Hello\n"
                          + "[2] Counting the Number of Characters\n"
                          + "[3] Printing Quotes\n"
                          + "[4] Mad Lib\n"
                          + "[5] Simple Math\n"
                          + "[6] Retirement Calculator");

      nextIntStr = keyboard.getInput();
      choice = Integer.parseInt(nextIntStr);

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
      }

    }while(choice != 0);

    return;
  }

}
