
public class SayingHello {

	public void sayingHello(){

		System.out.println("\n\n");
		System.out.println("What is your name?");
		System.out.println("Hello, " + getName() + ", nice to meet you.");
		System.out.println("\n\n");

	}

	public String getName (){

		Keyboard keyboard = new Keyboard();
		String name = keyboard.getInput();
		return name;

	}

}
