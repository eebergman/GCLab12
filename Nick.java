package com.Roshambo;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

//Player 3 - inherits from Bianca class

public abstract class Nick extends Bianca {

	@Override
	public void nick(String name, RoshamboTypes choice){
		name = "Nick";
		choice = RoshamboGenerator.getTheRandNo();
	}

}
