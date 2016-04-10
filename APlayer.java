package com.Roshambo;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

public class APlayer {

	private String name;
	private RoshamboTypes choice;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoshamboTypes getChoice(RoshamboTypes userThrowEnum) {
		return choice;
	}

	public void setChoice(RoshamboTypes choice) {
		this.choice = choice;
	}

	
	public APlayer(String userName, RoshamboTypes userThrowEnum) {
		name = userName;
		choice = userThrowEnum; 
	}



}
