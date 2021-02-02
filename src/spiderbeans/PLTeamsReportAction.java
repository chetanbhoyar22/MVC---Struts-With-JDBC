package spiderbeans;

import java.util.ArrayList;
import java.sql.*;
import myentities.PLeagueTeams;
import myservices.DBConnector;

public class PLTeamsReportAction 
{
	
	private ArrayList<PLeagueTeams> teamlist;
	
	public String execute()
	{
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			DBConnector dbobj=new DBConnector();
			con=dbobj.getConnected();
			
			st=con.createStatement();
			rs=st.executeQuery("select * from plteams");
			
			PLeagueTeams obj;
			teamlist=new ArrayList<PLeagueTeams>();
			
			while(rs.next())
			{
				obj=new PLeagueTeams();
				
				obj.setPlayerno(rs.getInt("playerno"));
				obj.setPlayername(rs.getString("playernm"));
				obj.setClub(rs.getString("club"));
				obj.setPosition(rs.getString("position"));
				obj.setCountry(rs.getString("country"));
				
				teamlist.add(obj);
			}			
		}
		catch(Exception ex)
		{
			System.out.println("Exception : "+ex.getMessage());
		}
		
		return "success";
	}

	public ArrayList<PLeagueTeams> getTeamlist() {
		return teamlist;
	}

	public void setTeamlist(ArrayList<PLeagueTeams> teamlist) {
		this.teamlist = teamlist;
	}
	
	

}
