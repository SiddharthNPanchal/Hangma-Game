package hangmanProject;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class hangmanGame extends showHangman{
	int cat, j = 0,f=0;
	int level = 1, life = 0;
	String randomWord, matchWord, incorrect = " ", selected = " ";
	char[] storeData = null;
	boolean flag = true;
	public hangmanGame() {
	}
	
	public hangmanGame(int cat) {
		// TODO Auto-generated constructor stub
		this.cat = cat;
	}
	//Function to choose random word from the category array//
	public int chooseWord() {
		Random word = new Random();
		return word.nextInt(5);
	}

	public void startGame() {
		// TODO Auto-generated method stub
		category newCat = new category();
		//Getting an array of selected Category from category class//
		String[] words = newCat.getCategory(this.cat);
		System.out.println("You have selected: " + newCat.categoryName(this.cat) + " category.");
		do {
			System.out.println("Level: " + level);
			flag = true;		
			selected = " ";
			incorrect = " ";
			life = 0;
			//Choosing a random word from selected category.
			int i = chooseWord();
			randomWord = words[i].toLowerCase();
			//
			matchWord = randomWord;
			int wordLentgh = randomWord.length();
			//Storing dashes in storeData and printing it as same as the size of chosen word randomly from words array//
			storeData = new char[wordLentgh];
			
			for (int k = 0; k < wordLentgh; k++) {
				if (randomWord.charAt(k) == ' ') {
					storeData[k] = ' ';
					System.out.print(" ");
				} else {
					storeData[k] = '_';
					System.out.print("_ ");
				}
			}
			//System.out.println("Random Word: " + randomWord);
			//LetterBank 
			System.out.println();
			char letterbank[] = "abcdefghijklmnopqrstuvxwyz".toCharArray();
			//char[] incorrect = new char[letterbank.length]; 
			System.out.println("Letter Bank:");
			//System.out.println();
			for (int l = 0; l < letterbank.length; l++) {
				//Printing letterbank on the console.
				System.out.print(letterbank[l] + " ");
			}
			int len = randomWord.length();
			boolean isLetterAvailable = false;
			int index = 0;
			while (flag && level<=5) {
				
				isLetterAvailable = false;
				index = 0;
				//Asking user to choose a character
				System.out.print("\nGuess a letter: ");
				Scanner sc = new Scanner(System.in);
				char c =' ';
				try {
					c = sc.next().toLowerCase().charAt(0);
				}
				catch(InputMismatchException e) {
					//System.out.println("Enter a character only");
				}
				//Giving user a message if the character is already chosen or not from the letterbank
				for (int l = 0; l < letterbank.length; l++) {
					if (letterbank[l] == c) {
						selected += letterbank[l];
						isLetterAvailable = true;
						index = l;
						break;
					} 
					else {
						continue;
					}
				}
				//Replacing a selected character with *.//
				if (isLetterAvailable) {
					letterbank[index] = '*';
				}
				else if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')))
				{
					//System.out.println("Enter a value between a to z");
				}
				
				else{			
						System.out.println("Character is already chosen!");	
				}
				System.out.println();
				
				/*Replacing Dash "_" with a character if the word contains chosen character 
				and giving an error if the word does not contain that chracter
				*/
				String s = String.valueOf(c);
				
				
				
				if (randomWord.contains(s)) {
					for (int l = 0; l < len; l++) {
						if (randomWord.charAt(l) == c) {
							storeData[l] = c;
						}	
					}
					System.out.println(storeData);
				}
				else {
					if(selected.contains(s)) {
						if(!incorrect.contains(s)) {
							incorrect = incorrect + s;
							life++;
							/*Giving user an error message if the wrong character is selected
							and showing hangman step by step*/
							showHangman show = new showHangman();
							show.displayHangman(life);
							System.out.println("You have chosen wrong character");
							System.out.println("You have " + (10 - life) + " lives left");
							if (life == 10) {
								System.out.println("Game Over!");
								flag = false;
								System.exit(0);
							}
						}
						else {
							//System.out.println("The char is already chosen");
						}
					}		
					else if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
						System.out.println("Enter a character only");
					}
				}
				
				System.out.println("Letter Bank: ");
				for (int l = 0; l < letterbank.length; l++) {
					System.out.print(letterbank[l] + " ");
				}
				System.out.println("\n--------------------");
				System.out.println("Incorrect Letters:");
				for(int l = 0; l<incorrect.length();l++)
				{
					System.out.println(incorrect.charAt(l));
				}
				
				//Increasing level if user guesses the word.//
				if(randomWord.equals(new String(storeData))) {
					flag = false;
					System.out.println("You have guessed the correct word!");
					if(level>=5) {
						System.out.println("You have won the game!");
						level++;
					}
					else {
						level++;
						//System.out.println("Level: " + level);
					}
				}
				
			}
			//System.out.println(storeData);
		} while (level <= 5);
	}
}