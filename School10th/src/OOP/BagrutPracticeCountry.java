package OOP;

public class BagrutPracticeCountry {
	private String countryName;
	private BagrutPracticeGame[] games = new BagrutPracticeGame[43];
	
	public BagrutPracticeCountry(String countryName) {
		this.countryName = countryName;
	}
	
	public boolean countryInGame(String gameName) {
		for (int i = 0; i < this.games.length; i++)   
			if (this.games[i].getGameName().equals(gameName)) return true;
		return false;
	}
}
