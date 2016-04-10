package com.Roshambo;

public class PlayerFactory<TypesOfPlayers> {
	
	
	public TypesOfPlayer getPlayer(String getPlayerA) {
		
		if (getPlayerA == "b" || getPlayerA == "n"){
			return new TypesOfPlayer(null, null);
		} else if (getPlayerA == "C"){
			return new TypesOfPlayer(null, null);
		} else {
			return new TypesOfPlayer(name, choice);
		}
		
		
		
		return null;

	}
}