package com.Roshambo;

import java.util.Scanner;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

public class Validator extends RoshamboApp {

	public static String stayOrGo(String validStayOrGo) {
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		String invalidKey = null;
		String isItValid = null;

		if (validStayOrGo.equalsIgnoreCase("n")) {
			isItValid = "quit";

		} else if (validStayOrGo.equalsIgnoreCase("y")) {
			isItValid = null;

		} else if (!validStayOrGo.equalsIgnoreCase("y")) {
			System.out.println("Invaild keystroke. Please enter 'Y' to play or 'N' to quit.");
			stayOrGo(invalidKey = scan.nextLine());
			scan.close();
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
			break;
		default:
			System.out.println("That is not a valid opponent choice, please select (B, C, or N)");
			verifyOpponent(incorrect = sc.nextLine());
			sc.close();
		}

		return verifyPlease;

	}

	public static String whoWon(RoshamboTypes userThrow, RoshamboTypes playerThrow) {
		String theWinnerIs = null;
		// x is a loss
		// y is a win

		if (userThrow == RoshamboTypes.rock) {
			if (playerThrow == RoshamboTypes.scissors) {
				theWinnerIs = "scissors beats rock! You won!";
			} else if (playerThrow == RoshamboTypes.paper) {
				theWinnerIs = "paper beats rock, you lost.";
			} else {
				theWinnerIs = "you threw the same thing, it's a tie!";
			}

		} else if (userThrow == RoshamboTypes.paper) {
			if (playerThrow == RoshamboTypes.rock) {
				theWinnerIs = "paper beats rock! You won!";
			} else if (playerThrow == RoshamboTypes.scissors) {
				theWinnerIs = "scissors beats paper, you lost.";
			} else {
				theWinnerIs = "you threw the same thing, it's a tie!";
			}

		} else if (userThrow == RoshamboTypes.scissors) {
			if (playerThrow == RoshamboTypes.paper) {
				theWinnerIs = "scissors beats paper! You won!";
			} else if (playerThrow == RoshamboTypes.rock) {
				theWinnerIs = "rock beats scissors, you lost.";
			} else {
				theWinnerIs = "you threw the same thing, it's a tie!";
			}

		}
		return theWinnerIs;
	}
}
