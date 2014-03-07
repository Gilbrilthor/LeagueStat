import java.util.Date;

/**
 * 
 */

/**
 * @author Matthew
 *
 */
public class Game {

	private int kills;
	private int deaths;
	private int assists;
	private int goldEarned;
	private int minionsKilled;
	private boolean didWin;
	private String champion;
	private Date datePlayed;
	/**
	 * @return the kills
	 */
	public int getKills() {
		return kills;
	}
	/**
	 * @param kills the kills to set
	 */
	public void setKills(int kills) {
		this.kills = kills;
	}
	/**
	 * @return the deaths
	 */
	public int getDeaths() {
		return deaths;
	}
	/**
	 * @param deaths the deaths to set
	 */
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	/**
	 * @param kills
	 * @param deaths
	 * @param assists
	 * @param goldEarned
	 * @param minionsKilled
	 * @param didWin
	 * @param champion
	 * @param datePlayed
	 */
	public Game(int kills, int deaths, int assists, int goldEarned,
			int minionsKilled, boolean didWin, String champion, Date datePlayed) {
		super();
		this.kills = kills;
		this.deaths = deaths;
		this.assists = assists;
		this.goldEarned = goldEarned;
		this.minionsKilled = minionsKilled;
		this.didWin = didWin;
		this.champion = champion;
		this.datePlayed = datePlayed;
	}
	/**
	 * @return the assists
	 */
	public int getAssists() {
		return assists;
	}
	/**
	 * @param assists the assists to set
	 */
	public void setAssists(int assists) {
		this.assists = assists;
	}
	/**
	 * @return the goldEarned
	 */
	public int getGoldEarned() {
		return goldEarned;
	}
	/**
	 * @param goldEarned the goldEarned to set
	 */
	public void setGoldEarned(int goldEarned) {
		this.goldEarned = goldEarned;
	}
	/**
	 * @return the minionsKilled
	 */
	public int getMinionsKilled() {
		return minionsKilled;
	}
	/**
	 * @param minionsKilled the minionsKilled to set
	 */
	public void setMinionsKilled(int minionsKilled) {
		this.minionsKilled = minionsKilled;
	}
	/**
	 * @return the didWin
	 */
	public boolean isDidWin() {
		return didWin;
	}
	/**
	 * @param didWin the didWin to set
	 */
	public void setDidWin(boolean didWin) {
		this.didWin = didWin;
	}
	/**
	 * @return the champion
	 */
	public String getChampion() {
		return champion;
	}
	/**
	 * @param champion the champion to set
	 */
	public void setChampion(String champion) {
		this.champion = champion;
	}
	/**
	 * @return the datePlayed
	 */
	public Date getDatePlayed() {
		return datePlayed;
	}
	/**
	 * @param datePlayed the datePlayed to set
	 */
	public void setDatePlayed(Date datePlayed) {
		this.datePlayed = datePlayed;
	}
}
