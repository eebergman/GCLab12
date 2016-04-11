//Need to fix where if user selects !yn for start game noSuchElementException @LN46

package com.Roshambo;

import java.util.ArrayList;
import java.util.Scanner;

import com.Roshambo.RoshamboEnum.RoshamboTypes;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String stayOrGo = null;
		@SuppressWarnings("unused")
		String chooseToStart;
		String userName;
		String userThrow;
		String opponentValid;
		@SuppressWarnings("unused")
		String isOppVal;
		// String oppName = null;
		String winOrLose = null;
		APlayer opponent = null;
		RoshamboTypes oppThrowEnum = null;
		RoshamboTypes userThrowEnum;

		ArrayList<String> nameOfOpp = new ArrayList<String>();
		ArrayList<String> determination = new ArrayList<String>();
		ArrayList<RoshamboTypes> throwOfUser = new ArrayList<RoshamboTypes>();
		ArrayList<RoshamboTypes> throwOfOpp = new ArrayList<RoshamboTypes>();

		System.out.println("Hello and welcome to Random Roshambo!");

		System.out.println("\nWhat is your name?");
		userName = sc.nextLine();

		System.out.println("\nWould you care for a game of Rock, Paper, Scissors? (Y/N)");
		stayOrGo = Validator.stayOrGo(chooseToStart = sc.nextLine());

		while (stayOrGo == null) {
			System.out.println("What would you like to throw?" + "\n\tPress 'R' for rock." + "\n\tPress 'P' for paper."
					+ "\n\tPress 'S' for scissors.");
			userThrow = sc.nextLine();
			userThrowEnum = Validator.playerThrow(userThrow);
			throwOfUser.add(userThrowEnum);

			User playerUser = new User(userName, userThrowEnum);

			// System.out.println(playerUser.getName()); //to print user name
			// System.out.println(playerUser.getChoice(userThrowEnum)); //to
			// print user choice

			System.out.println("Welcome " + playerUser.getName() + " I have three opponents " + "for you to challenge."
					+ "\n\tPress 'B' for Bianca" + "\n\tPress 'C' for Chelsea" + "\n\tPress 'N' for Nick");
			opponentValid = Validator.verifyOpponent(isOppVal = sc.nextLine());

			switch (opponentValid) { // creates an opponent based on user input
			case "b":
				opponent = new bianca(null, null);
				break;
			case "c":
				opponent = new chelsea(null, null);
				break;
			default:
				opponent = new nick(null, null);
				break;
			}

			nameOfOpp.add(opponent.getName()); // adds the name of each opp to
												// the oppName arraylist
			throwOfOpp.add(opponent.getChoice(null)); // adds the throw of each
														// opp to the oppThrow
														// arraylist

			// System.out.println(opponent.getChoice(null));

			winOrLose = Validator.whoWon(userThrowEnum, opponent.getChoice(null)); // determines
																					// who
																					// won
																					// or
																					// lost.

			determination.add(winOrLose); // adds the determination of the match
											// to determination arraylist

			// from arraylist

			System.out.println("\n\nYou played " + playerUser.getChoice(userThrowEnum) + " and " + opponent.getName()
					+ " played " + opponent.getChoice(null) + " and because " + winOrLose);

			System.out.println("Would you like to play again?");
			stayOrGo = Validator.stayOrGo(chooseToStart = sc.nextLine());
		}

		System.out.println("\n\nA history of your matches today." + "\nFirst you played " + nameOfOpp.get(0) + "."
				+ "You threw " + throwOfUser + " and they threw " + throwOfOpp + " " + determination + ".'");

		for (int i = 1; i <= nameOfOpp.size(); i++) {
			System.out.println(" The next game you played " + nameOfOpp.get(i) + ". \nYou threw " + throwOfUser
					+ " and they threw " + throwOfOpp + " and because " + determination.get(i));
//this is broken.
			
		}

		sc.close();
	}
}