package com.Roshambo;

import java.util.Random;

public class RoshamboGenerator extends RoshamboEnum {

	public static RoshamboTypes getTheRandNo() {

		Random rand = new Random();

		rand.setSeed(System.nanoTime());

		String randomNo = String.valueOf(rand.nextInt((3 - 1) + 1) - 1);

		RoshamboTypes itIsAWord = makeItRoshambo(randomNo);

		return itIsAWord;

	}

	public static RoshamboTypes makeItRoshambo(String makeIt) {

		RoshamboTypes theGoods = null;

		switch (makeIt) {
		case "0":
			theGoods = RoshamboTypes.rock;
			break;
		case "1":
			theGoods = RoshamboTypes.paper;
			break;
		default:
			theGoods = RoshamboTypes.scissors;
		}

		return theGoods;

	}
}
