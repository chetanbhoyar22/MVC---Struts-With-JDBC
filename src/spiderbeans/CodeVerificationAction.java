package spiderbeans;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CodeVerificationAction extends ActionSupport implements SessionAware
{
	private String username;
	private String code;
	
	private String status;
	
	private Map<String,Object> session;
	
	public CodeVerificationAction()
	{
		username="";
		code="";
		status="fail";
	}
	
	public String execute()
	{
		if(code.equals("soham"))
		{
			session.put("name", username);
			status="success";
		}
		
		return status;
	}
	
	
	public void validate()
	{
		if(username.length()==0)
			addFieldError("username","Enter name");
		
		if(code.length()==0)
			addFieldError("code","Enter Code");
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
