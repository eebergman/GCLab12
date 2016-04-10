package com.Roshambo;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

//Player 2 - Random

public class bianca extends APlayer {

	public bianca(String userName, RoshamboTypes userThrowEnum) {
		super(userName, userThrowEnum);
		setName("Bianca");
		setChoice(RoshamboGenerator.getTheRandNo());
	}
	
	
}