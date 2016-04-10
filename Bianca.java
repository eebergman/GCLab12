package com.Roshambo;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

//Player 2 - Random

public abstract class Bianca implements TalkToPlayer {

	@Override
	public void bianca(String name, RoshamboTypes choice){
		name = "Bianca";
		choice = RoshamboGenerator.getTheRandNo();
	}

	public void nick(String name, RoshamboTypes choice) {
		// TODO Auto-generated method stub
		
	}
}
