package com.Roshambo;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

public class nick extends APlayer {

	public nick(String userName, RoshamboTypes userThrowEnum) {
		super(userName, userThrowEnum);
		setName("Nick");
		setChoice(RoshamboGenerator.getTheRandNo());
	}
	
	
	
}