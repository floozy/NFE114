package entité;

public class Fabricants {
String name;
String email;
private String getName() {
	return name;
}
private void setName(String name) {
	this.name = name;
}
private String getEmail() {
	return email;
}
private void setEmail(String email) {
	this.email = email;
}
public Fabricants(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}


}
