package com.pojo;

import org.springframework.stereotype.Component;


@Component
public class NinePojo 
{
	private int roll;
	private float english,sindhi,computer_biology,physics,math;
	private String check_com_bio;
	public int getRoll() {
		return roll;
	}
	public float getEnglish() {
		return english;
	}
	public float getSindhi() {
		return sindhi;
	}
	public float getComputer_biology() {
		return computer_biology;
	}
	public float getPhysics() {
		return physics;
	}
	public float getMath() {
		return math;
	}
	public String getCheck_com_bio() {
		return check_com_bio;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public void setSindhi(float sindhi) {
		this.sindhi = sindhi;
	}
	public void setComputer_biology(float computer_biology) {
		this.computer_biology = computer_biology;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public void setCheck_com_bio(String check_com_bio) {
		this.check_com_bio = check_com_bio;
	}

    
	
	
	
	
	
}
