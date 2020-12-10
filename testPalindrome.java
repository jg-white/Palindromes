import java.util.Scanner;
public class testPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		System.out.println("type \"exit\" to exit");
		while(!userInput.equals("exit")) {
			System.out.print("\nEnter Number/Word to check: ");
			userInput = scan.nextLine();
			String reversed = "";
			
			for(int i = 0; i < userInput.length(); i++) {
				reversed += userInput.charAt(userInput.length() - (i+1));
			}
			
			System.out.println("\"" + userInput + "\" reversed is \"" + reversed + "\"");
			
			if(userInput.equals(reversed)) {
				System.out.println(userInput + " is a Palindrome!");
			}
			else {
				System.out.println(userInput + " is NOT a Palindrome!");
			}
		}
		scan.close();
		System.out.println("exiting...");
	}

}
