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

public class PizzaParty {

  public void pizzaParty () {

    System.out.println("\n\n");//formatting
    Keyboard keyboard = new Keyboard();
    System.out.println("How many people?");
    String numPeopleStr = keyboard.getInput();
    int numPeople = Integer.parseInt(numPeopleStr);
    System.out.println("How many pizzas do you have?");
    String numPizzasStr = keyboard.getInput();
    int numPizzas = Integer.parseInt(numPizzasStr);
    System.out.println(""); //formatting
    System.out.println(String.format("%s people with %s pizzas.", numPeople, numPizzas));
    System.out.println(String.format("Each person gets %s pieces of pizza.", getNumSlices(numPeople, numPizzas)));
    System.out.println(String.format("There are %s leftover pieces.", getNumLeftovers(numPeople, numPizzas)));
    System.out.println("\n\n");//formatting

  }

  public int getNumSlices (int p, int za) {

    return p / za;

  }

  public int getNumLeftovers (int p, int za) {

    return p % za;

  }

}
