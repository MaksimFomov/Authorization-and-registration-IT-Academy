package com.fomov.authorizationAndRegistration.bean;

public class User {
	private String email;
	private String password;
	private String dateOfBirthday;
	
	public User() {}
	
	public User(String email, String password, String dateOfBirthday) {
		this.email = email;
		this.password = password;
		this.dateOfBirthday = dateOfBirthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(String dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
}
