package com.Roshambo;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

//Player 1 - Only Chooses Rock

public class chelsea extends APlayer {

	public chelsea(String userName, RoshamboTypes userThrowEnum) {
		super(userName, userThrowEnum);
		setName("Chelsea");
		setChoice(RoshamboTypes.rock);
	}
	
	
}