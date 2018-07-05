package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class LoginPojo 
{
private String name;
private int password;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
    
}
