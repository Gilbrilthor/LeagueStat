import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */

/**
 * @author Matthew
 *
 */
public class GameManager {

	
	ArrayList<Game> games;
	
	public void addGame(Game game)
	{
		// Add the game
		games.add(game);
	}
	
	/**
	 * 
	 */
	public GameManager() {
		// Make a new list for games
		games = new ArrayList<>();
	}

	public void removeGame(Game game)
	{
		// Find the game to remove
		// Remove the game
		games.remove(game);
		
	}
	
	public Game[] viewGames()
	{
		// Return the games
		// Convert from list to array
		Game[] gameArray = null;
		
		gameArray = games.toArray(gameArray);
		
		return gameArray;
		
		
	}
	
	public double[] getStats()
	{
		// Calculate Stats
		// Median of...
		// kills
		// Get list of kills
		ArrayList<Integer> kills = new ArrayList<>(); 
		for (Game game : games) {
			int killCount = game.getKills();
			kills.add(killCount);
		}
		// Sort list
		Collections.sort(kills);
		// Pick middle value
		int medianIndex = kills.size() / 2;
		int medianKill = kills.get(medianIndex);
		// deaths
		
		ArrayList<Integer> deaths = new ArrayList<>(); 
		for (Game game : games) {
			int deathCount = game.getDeaths();
			deaths.add(deathCount);
		}
		// Sort list
		Collections.sort(deaths);
		// Pick middle value
		medianIndex = deaths.size() / 2;
		int medianDeath = deaths.get(medianIndex);
		
		// assists
		// minionKills
		// goldEarned
		// wins
		return null;
	}
	
	
}
