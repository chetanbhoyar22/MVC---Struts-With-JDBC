package spiderbeans;

import java.sql.*;

import myservices.DBConnector;

public class NewAccountAction 
{
	private int accountno;
	private String accountnm;
	private String accounttype;
	private String balance;
	
	private String registerstatus;
	
	public NewAccountAction()
	{
		accountno=0;
		accountnm="";
		accounttype="";
		balance="";
		
		registerstatus="fail";
	}
	
	public String execute()
	{
		Connection con;
		PreparedStatement pst;
		
		try
		{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chetan?user=root&&password=12345");
			
			DBConnector obj=new DBConnector();
			con=obj.getConnected();
			
			pst=con.prepareStatement("insert into accounts values(?,?,?,?)");
			
			pst.setInt(1, accountno);
			pst.setString(2,accountnm);
			pst.setString(3,accounttype);
			pst.setString(4,balance);
			
			pst.executeUpdate();
			
			registerstatus="success";
			
			con.close();
			
		}
		catch(Exception ex) 
		{			
			System.out.println("Error : "+ex.getMessage());
			registerstatus="fail";
		}
		
		return registerstatus;
	}
	

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getAccountnm() {
		return accountnm;
	}

	public void setAccountnm(String accountnm) {
		this.accountnm = accountnm;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getRegisterstatus() {
		return registerstatus;
	}

	public void setRegisterstatus(String registerstatus) {
		this.registerstatus = registerstatus;
	}
	
	

}
