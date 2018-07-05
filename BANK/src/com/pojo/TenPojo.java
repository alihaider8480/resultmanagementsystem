package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class TenPojo 
{
	private int roll;
	private float english,urdu,islamiat,physics,math;
	public int getRoll() {
		return roll;
	}
	public float getEnglish() {
		return english;
	}
	public float getUrdu() {
		return urdu;
	}
	public float getIslamiat() {
		return islamiat;
	}
	public float getPhysics() {
		return physics;
	}
	public float getMath() {
		return math;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public void setUrdu(float urdu) {
		this.urdu = urdu;
	}
	public void setIslamiat(float islamiat) {
		this.islamiat = islamiat;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public void setMath(float math) {
		this.math = math;
	}
	
	
}
