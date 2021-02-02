package spiderbeans;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import myentities.Celebrity;
import myservices.DBConnector;

public class CelebrityListAction 
{
private ArrayList<Celebrity> celeblist;
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
	rs=st.executeQuery("select * from celebs");
	
	celeblist=new ArrayList<Celebrity>();
	Celebrity celeb;
	
	while(rs.next())
	{
		celeb=new Celebrity();
		celeb.setCelebno(rs.getInt("celebno"));
		celeb.setCelebname(rs.getString("celebnm"));
		celeb.setCountry(rs.getString("country"));
		celeb.setField(rs.getString("field"));
		
		celeblist.add(celeb);
	}
}
catch(Exception ex)
{
	System.out.println("Exception :"+ex);
	
}
return "success";
	
}
public ArrayList<Celebrity> getCeleblist() {
	return celeblist;
}
public void setCeleblist(ArrayList<Celebrity> celeblist) {
	this.celeblist = celeblist;
}
}
