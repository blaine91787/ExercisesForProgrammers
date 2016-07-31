
public class CountingCharacters {

	public void countingCharacters () {

		System.out.println("\n\n");
		Keyboard keyboard = new Keyboard();
		System.out.println("What is the input string?");
		String str = keyboard.getInput();
		int count = str.length();
		System.out.println(str + " has " + count + " characters.");
		System.out.println("\n\n");

	}

}
