package com.bilgeadam.bankaOdevi;

public class User {
	public String name;
	public String surname;
	public String eMail;
	public Account account;
	
	public User(String name, String surname, Account account) {
		super();
		this.name = name;
		this.surname = surname;
		this.account = account;
	}

	
}
