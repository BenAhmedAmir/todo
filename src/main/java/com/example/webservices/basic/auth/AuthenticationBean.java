package com.example.webservices.basic.auth;

public class AuthenticationBean {
	String message;
	public AuthenticationBean(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return String.format("HelloBean [message=%s]", message); 
	}
}
