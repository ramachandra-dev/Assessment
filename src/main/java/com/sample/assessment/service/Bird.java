package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */
public class Bird extends Animal {
	public void fly() {
		logMessage(I_AM_FLYING);
	}

	public void sing() {
		logMessage(I_AM_SINGING);

	}

	@Override
	public void walk() {
		logMessage(I_AM_WALKING);
	}
	
	@Override
	public void swim() {
		logMessage(I_AM_SWIMMING);		
	}
	
	@Override
	public void logMessage(String statement) {
		System.out.println(this.getClass().getSimpleName() + statement);

	}

	
}
