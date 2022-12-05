package com.fomov.authorizationAndRegistration.bean;

public class User {
	private String login;
	private String password;
	private String dateOfBirthday;
	
	public User(String login, String password, String dateOfBirthday) {
		this.login = login;
		this.password = password;
		this.dateOfBirthday = dateOfBirthday;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
