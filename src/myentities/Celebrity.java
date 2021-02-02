package myentities;

public class Celebrity 
{
private int celebno;
private String celebname;
private String field;
private String country;

public Celebrity()
{
	celebno=0;
	celebname="";
	field="";
	country="";	
}

public int getCelebno() {
	return celebno;
}

public void setCelebno(int celebno) {
	this.celebno = celebno;
}

public String getCelebname() {
	return celebname;
}

public void setCelebname(String celebname) {
	this.celebname = celebname;
}

public String getField() {
	return field;
}

public void setField(String field) {
	this.field = field;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}


}
