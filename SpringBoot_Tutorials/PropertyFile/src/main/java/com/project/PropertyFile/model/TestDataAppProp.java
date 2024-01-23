package com.project.PropertyFile.model;

public class TestDataAppProp {

	private String username;
	private String password;

	public TestDataAppProp() {
		super();
	}

	public TestDataAppProp(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void testAppProp() {
		System.out.println(username);
		System.out.println(password);

	}

}
