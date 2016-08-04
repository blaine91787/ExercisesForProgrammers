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

/**
 *PaintCalculator class gets the length and the width of a room from the user
 *to let the user now how many cans of paint the user will need when one can
 *of paint covers 350 square feet.
 */

public class PaintCalculator {

  /**
   *paintCalculator() handles getting the input from the user and uses
   *getGallonsOfPaint() and getSquareFeet() to convert values.
   */

  public void paintCalculator() {

    System.out.println("\n\n");
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
    System.out.println("\n\n");

  }

  /**
   *getGallonsOfPaint() takes in the length and the width and returns the gallons of paint needed
   *to cover the room.
   */

  private double getGallonsOfPaint(int l, int w) {

    double x = Math.ceil( (float)( l * w ) / 350 );
    return x;

  }

  /**
   *getSquareFeet() takes in the length and the width and returns the square
   *footage of the room.
   */
   
  private float getSquareFeet(int l, int w) {

    return (float)l * w;

  }
}
