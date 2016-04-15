package service;

public class User {

	private String email;
	private String passwd;
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getPasswd() {
		return passwd;
	}
	private void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public User(String email, String passwd) {
		super();
		this.email = email;
		this.passwd = passwd;
	}
	
	
}
