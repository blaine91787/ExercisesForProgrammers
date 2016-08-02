/*******************************************************************************
**
**
**              Name: Blaine Harris
**              Project: ExercisesForProgrammers
**              File: PizzaParty.java
**              Date: 08/01/16
**              Language: java
**
**
**
/******************************************************************************/

public class PaintCalculator {

  public void paintCalculator() {

    Keyboard keyboard = new Keyboard();
    System.out.println("What is the length of the room?");
    String lengthStr = keyboard.getInput();
    int length = Integer.parseInt(lengthStr);
    System.out.println("What is the width of the room?");
    String widthStr = keyboard.getInput();
    int width = Integer.parseInt(widthStr);
    System.out.println("");//formatting
    System.out.println(String.format("You will need to purchase %s gallons of\n", getGallonsOfPaint(length, width))
                          + String.format("paint to cover %s square feet.", getSquareFeet(length, width)));

  }


  /*
    BUG:
      getGallonsOfPaint() is rounding down, possibly based on decimal places
      */

  private double getGallonsOfPaint(int l, int w) {

    System.out.println(String.format("\n %s",  ( l * w ) / 350 ));
    double x = Math.ceil( ( l * w ) / 350 );
    return x;

  }

  private int getSquareFeet(int l, int w) {

    return l * w;

  }
}
