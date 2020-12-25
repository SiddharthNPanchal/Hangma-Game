package hangmanProject;

public class showHangman {
	public void displayHangman(int life) {
		switch(life) {
		case 1:
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("    ____      ");
			System.out.println("   |    |    \n");	
			break;
		case 2:
			System.out.println("              ");
			System.out.println("      |       ");
			System.out.println("      |       ");
			System.out.println("      |       ");
			System.out.println("      |       ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		case 3:
			System.out.println("       ____   ");
			System.out.println("      |       ");
			System.out.println("      |       ");
			System.out.println("      |       ");
			System.out.println("      |       ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		case 4:
			System.out.println("       ____    ");
			System.out.println("      |    |   ");
			System.out.println("      |        ");
			System.out.println("      |        ");
			System.out.println("      |        ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		case 5:
			System.out.println("       ____    ");
			System.out.println("      |    |   ");
			System.out.println("      |    O   ");
			System.out.println("      |        ");
			System.out.println("      |        ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		case 6:
			System.out.println("       ____    ");
			System.out.println("      |    |   ");
			System.out.println("      |    O   ");
			System.out.println("      |    |   ");
			System.out.println("      |        ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		case 7:
			System.out.println("       ____    ");
			System.out.println("      |    |   ");
			System.out.println("      |    O   ");
			System.out.println("      |   /|   ");
			System.out.println("      |        ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		case 8:
			System.out.println("       ____    ");
			System.out.println("      |    |   ");
			System.out.println("      |    O   ");
			System.out.println("      |   /|\\ ");
			System.out.println("      |        ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		case 9:
			System.out.println("       ____    ");
			System.out.println("      |    |   ");
			System.out.println("      |    O   ");
			System.out.println("      |   /|\\ ");
			System.out.println("      |   /    ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		case 10:
			System.out.println("       ____    ");
			System.out.println("      |    |   ");
			System.out.println("      |    O   ");
			System.out.println("      |   /|\\ ");
			System.out.println("      |   / \\ ");
			System.out.println("    __|__      ");
			System.out.println("   |     |   \n");
			break;
		}
	}
}
