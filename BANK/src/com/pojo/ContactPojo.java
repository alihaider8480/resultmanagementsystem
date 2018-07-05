package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class ContactPojo 
{
 private String name,message;

public String getName() {
	return name;
}

public String getMessage() {
	return message;
}

public void setName(String name) {
	this.name = name;
}

public void setMessage(String message) {
	this.message = message;
}
}
