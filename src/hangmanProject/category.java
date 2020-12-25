package hangmanProject;

public class category {
	public String[] sports = {"Cricket", "Football", "Basket Ball", "Ice Hockey", "Rugby"};
	public String[] games = {"PUBG", "Call of duty", "Counter Strike", "Ludo", "Valorant"};
	public String[] movies = {"Welcome", "Notebook", "Extraction", "Aquaman", "Justice league"};
	public String[] shows = {"Money heist", "The Flash", "Suits", "Daredevil", "Game of Thrones"};
	public String[] city = {"Barrie", "Toronto", "Ottawa", "Hamilton", "Sudbury"};
	public String name;
	public category() {
		
	}
	public String[] getCategory(int cat) {
		String[] category = null;
		switch (cat) {
		case 1:
			category = this.sports;
			break;
		case 2:
			category = this.games;
			break;
		case 3:
			category = this.movies;
			break;
		case 4:
			category = this.shows;
			break;
		case 5:
			category = this.city;
			break;
		}
		return category;
	}
	
	public String categoryName(int cat) {
		switch (cat) {
		case 1:
			name = "Sports";
			break;
		case 2:
			name = "Games";
			break;
		case 3:
			name = "Movies";
			break;
		case 4:
			name = "Shows";
			break;
		case 5:
			name = "City";
			break;
		}
		return name;
	}
	
}
