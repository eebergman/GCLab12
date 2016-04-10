package com.Roshambo;

import java.util.Scanner;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

public class Validator extends RoshamboApp {

	public static String stayOrGo(String validStayOrGo) {
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		String invalidKey = null;
		String isItValid = null;

		if (validStayOrGo.equalsIgnoreCase("q")) {
			isItValid = "quit";
		} else if (!validStayOrGo.equalsIgnoreCase("s")) {
			System.out.println("Invaild keystroke. Please enter 'S' to start or 'Q' to quit.");
			stayOrGo(invalidKey = sc.nextLine());
			sc.close();
		}

		return isItValid;
	}

	public static RoshamboTypes playerThrow(String userInput) {
		RoshamboTypes isItValid = null;

		userInput = userInput.toLowerCase();

		switch (userInput) {
		case "r":
			isItValid = RoshamboTypes.rock;
			break;
		case "p":
			isItValid = RoshamboTypes.paper;
			break;
		case "s":
			isItValid = RoshamboTypes.scissors;
			break;
		default:
			isItValid = null;
		}

		return isItValid;
	}

	public static String verifyOpponent(String verifyPlease) {
		Scanner sc = new Scanner(System.in);

		String isOppValid = verifyPlease.toLowerCase();
		@SuppressWarnings("unused")
		String incorrect;

		switch (isOppValid) {
		case "b":
			isOppValid = "b";
			break;
		case "c":
			isOppValid = "c";
			break;
		case "n":
			isOppValid = "n";
		default: 
			System.out.println("That is not a valid opponent choice, please select (B, C, or N)");
			verifyOpponent(incorrect = sc.nextLine());
			sc.close();
		}

		return verifyPlease;

	}

}
