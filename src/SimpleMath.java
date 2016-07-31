public class SimpleMath {

  public void simpleMath () {

    System.out.println("\n\n");
    Keyboard keyboard = new Keyboard();
    System.out.println("What is the first number?");
    String nextIntStr1 = keyboard.getInput();
    int x = Integer.parseInt(nextIntStr1);
    System.out.println("What is the second number?");
    String nextIntStr2 = keyboard.getInput();
    int y = Integer.parseInt(nextIntStr2);
    System.out.println(String.format("%s + %s = %s\n", x, y, sum(x,y))
                        + String.format("%s - %s = %s\n", x, y, difference(x,y))
                        + String.format("%s * %s = %s\n", x, y, product(x,y))
                        + String.format("%s / %s = %s", x, y, quotient(x,y)));
    System.out.println("\n\n");

  }

  private int sum(int x, int y){
    return x + y;
  }

  private int difference(int x, int y){
    return x - y;
  }

  private int product(int x, int y){
    return x * y;
  }

  private float quotient(int x, int y){
    return (float)x / y;
  }

}
