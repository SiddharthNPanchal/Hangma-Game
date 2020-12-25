package hangmanProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hangmanProject {
	//Displaying rules of the game
	private static void viewRules() {
		// TODO Auto-generated method stub'
		System.out.println("There are 5 levels in the games");
		System.out.println("You are given 10 lives in each level.");
		System.out.println("To win the game, you have to pass all the 5 levels");
		System.out.println(
				"In each level, you have to guess the word and if you do so, you will be passed to next level.");
	}
	public static void main(String[] args) {
		while (true) {
			//Menu for user
			System.out.println("Menu:");
			System.out.println("1. Start the game:");
			System.out.println("2. View the rules");
			System.out.println("3. Exit the game");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			try {
				int value = sc.nextInt();
				switch (value) {
				case 1:
					//Displaying categories.
					System.out.println("Please select one of the categories:");
					System.out.println("1. Sports");
					System.out.println("2. Games");
					System.out.println("3. Movies");
					System.out.println("4. Tv Shows");
					System.out.println("5. Cities");
					try {
						int cat = sc.nextInt();
						if(cat > 5) {
							System.out.println("Enter valid option.");
							break;
						}
						else {
						hangmanGame game = new hangmanGame(cat);
						game.startGame();
						}
					} catch (InputMismatchException e) {
						System.out.println("Enter valid option.");
					}
					break;
				case 2:
					viewRules();
					System.out.println("Press any letter or digit to go back!");
					char val = sc.next().charAt(0);
					if(Character.isLetterOrDigit(val)) {
						break;
					}
					else {
						System.out.println("Opps! You have pressed wrong key");
						System.exit(02);
						
					}
				case 3:
					System.out.println("Exited");
					System.exit(0);
//				default:
//					System.out.println("Enter valid option");
				}
			} catch (InputMismatchException e) {
				System.out.println("Enter a digit according to menu!");
			}
		}
	}
}
