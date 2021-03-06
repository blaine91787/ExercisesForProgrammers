/*******************************************************************************
**
**
**              Name: Blaine Harris
**              Project: ExercisesForProgrammers
**              File: RetirementCalculator.java
**              Date: 08/01/16
**              Language: java
**
**
**
/******************************************************************************/

import java.util.Calendar;

public class RetirementCalculator {

  public void retirementCalculator(){
    Calendar now = Calendar.getInstance();
    int currentYear = now.get(Calendar.YEAR);
    System.out.println("\n\n");
    Keyboard keyboard = new Keyboard();
    System.out.println("What is your current age?");
    String nextIntStr1 = keyboard.getInput();
    int currentAge = Integer.parseInt(nextIntStr1);
    System.out.println("At what age would you like to retire?");
    String nextIntStr2 = keyboard.getInput(); //Gets input from user as a string
    int retirementAge = Integer.parseInt(nextIntStr2); //Converts input to int
    System.out.println(String.format("You have %s years left until you can retire.", yearsUntilRetirement(retirementAge, currentAge)));
    System.out.println(String.format("It's %s, so you can retire in %s", currentYear, yearToRetire(currentYear, yearsUntilRetirement(retirementAge, currentAge))));
    System.out.println("\n\n");

  }

  private int yearsUntilRetirement(int x, int y){
    return Math.abs(x-y);
  }

  private int yearToRetire(int x, int y){
    return x+y;
  }
}
