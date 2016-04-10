package com.Roshambo;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

public class TypesOfPlayer extends RoshamboApp {

	private String name;
	private RoshamboTypes choice;

	public String getName(String name2) {
		return name2;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoshamboTypes getChoice(RoshamboTypes choice2) {
		return choice2;
	}

	public void setChoice(RoshamboTypes choice) {
		this.choice = choice;
	}
	
	public String toString() {
		return name;
	}

	public TypesOfPlayer(String name, RoshamboTypes choice) {
		String gottenName = getName(name);
		RoshamboTypes gottenChoice = getChoice(choice);
	}

}
