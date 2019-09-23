package com.shelken.action;

import com.opensymphony.xwork2.ActionSupport;

public class login_register extends ActionSupport{
	
	public String login() {
		
		return "login";
	}
	public String register() {
		int i = 1;
		return "register";

	}
}
