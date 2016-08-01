/*******************************************************************************
**
**
**              Name: Blaine Harris
**              Project: ExercisesForProgrammers
**              File: AreaOfARectangularRoom.java
**              Date: 08/01/16
**              Language: java
**
**
**
/******************************************************************************/

import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 *AreaOfARectangularRoom.java is a class that takes a length and width from the
 *user and converts it to area in both standard and metric formats.
 */
public class AreaOfARectangularRoom {

  /**
   *getArea() handles getting the user input and displaying the values.  The
   *user input is converted using getStandardArea() and getMetricArea().
   */

  public void getArea () {

    Keyboard keyboard = new Keyboard();
    System.out.println("What is the length of the room in feet?");
    String lengthStr = keyboard.getInput();
    int length = Integer.parseInt(lengthStr);
    System.out.println("What is the width of the room in feet?");
    String widthStr = keyboard.getInput();
    int width = Integer.parseInt(widthStr);
    System.out.println(String.format("You entered dimesions of %s feet by %s feet.", length, width));
    System.out.println("The area is");
    System.out.println(String.format("%s square feet", getStandardArea(length, width)));
    System.out.println(String.format("%s square meters", getMetricArea(length, width)));

  }

  /**
   *getStandardArea() takes in a length [l] and a width [w] and returns a
   *converted float.
   */

  private float getStandardArea (int l, int w) {

    return l * w;

  }

  /**
   *getMetricArea() takes in a length [l] and a width [w] and returns a
   *converted String.
   */
   
  private String getMetricArea (int l, int w) {

    DecimalFormat df = new DecimalFormat("#.####");
    df.setRoundingMode(RoundingMode.CEILING);
    double conversionConstant = 0.09290304;
    double conversion = (l * w) * conversionConstant;
    return df.format(conversion);

  }

}
