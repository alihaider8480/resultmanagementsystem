package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class StudentPojo 
{
   private int roll;
   private String name,fathername,classs,section,contact;
   
public int getRoll() {
	return roll;
}

public String getName() {
	return name;
}

public String getFathername() {
	return fathername;
}

public String getClasss() {
	return classs;
}

public String getSection() {
	return section;
}

public String getContact() {
	return contact;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public void setName(String name) {
	this.name = name;
}

public void setFathername(String fathername) {
	this.fathername = fathername;
}

public void setClasss(String classs) {
	this.classs = classs;
}

public void setSection(String section) {
	this.section = section;
}

public void setContact(String contact) {
	this.contact = contact;
}

public void show_single_result( String name, String fathername, String classs, String section, String contact) {
	
	
	this.name = name;
	this.fathername = fathername;
	this.classs = classs;
	this.section = section;
	this.contact = contact;
}


  

}
