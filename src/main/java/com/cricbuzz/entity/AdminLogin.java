package com.cricbuzz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdminLogin {
	@Id
	@GeneratedValue
	private Integer id;
	private String login_id;
	private String login_password;
	public AdminLogin() {
		super();
	}
	public AdminLogin(Integer id, String login_id, String login_password) {
		super();
		this.id = id;
		this.login_id = login_id;
		this.login_password = login_password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	
}
