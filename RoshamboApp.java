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
		@SuppressWarnings("unused")
		String userThrow;
		String opponentValid;
		String isOppVal;
		String oppName = null;
		APlayer opponent = null;
		RoshamboTypes oppThrowEnum = null;
		RoshamboTypes userThrowEnum;

		ArrayList<String> nameOfOpp = new ArrayList<String>();
		ArrayList<String> determination = new ArrayList<String>();
		ArrayList<RoshamboTypes> throwOfUser = new ArrayList<RoshamboTypes>();
		ArrayList<RoshamboTypes> throwOfOpp = new ArrayList<RoshamboTypes>();
		

		System.out.println("Hello and welcome, would you care for a game of Rock, Paper, Scissors?");
		stayOrGo = Validator.stayOrGo(chooseToStart = sc.nextLine());

		System.out.println("Excellent. What is your name?");
		userName = sc.nextLine();
		

		while (stayOrGo == null) {
			System.out.println("What would you like to throw?" + "\n\tPress 'R' for rock." + "\n\tPress 'P' for paper."
					+ "\n\tPress 'S' for scissors.");
			userThrowEnum = Validator.playerThrow(userThrow = sc.nextLine());
			throwOfUser.add(userThrowEnum);

		User playerUser = new User(userName, userThrowEnum);
		
		System.out.println(playerUser.getName());  		 //to print user name
		System.out.println(playerUser.getChoice(userThrowEnum)); //to print user choice
		
		
		
		
		System.out.println("Welcome " + playerUser.getName() + " I have three opponents "
				+ "for you to challenge."
				+ "\n\tPress 'B' for Bianca"
				+ "\n\tPress 'C' for Chelsea"
				+ "\n\tPress 'N' for Nick");
		opponentValid = Validator.verifyOpponent(isOppVal = sc.nextLine());
		
		switch (opponentValid){
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
		
		System.out.println(opponent.getName());
		System.out.println(opponent.getChoice(null));
		
//		
//		
////		TypesOfPlayer playerOpp = 
//		
////		System.out.println(playerOpp.getName(userName));
////		System.out.println(playerOpp.getChoice(userThrowEnum));
//		
		}
		sc.close();
	}
}