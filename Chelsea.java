package com.Roshambo;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

//Player 1 - Only Chooses Rock

public abstract class Chelsea implements TalkToPlayer {

	@Override
	public void chelsea(String name, RoshamboTypes choice) {
		name = "Chelsea";
		choice = RoshamboTypes.rock;
	}
}
