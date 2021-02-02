package myentities;

public class PLeagueTeams 
{
	private int playerno;
	private String playername;
	private String club;
	private String country;
	private String position;
	
	public PLeagueTeams()
	{
		playerno=0;
		playername="";
		club="";
		country="";
		position="";
	}

	public int getPlayerno() {
		return playerno;
	}

	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
