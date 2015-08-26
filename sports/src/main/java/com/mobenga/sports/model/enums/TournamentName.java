package com.mobenga.sports.model.enums;

public enum TournamentName {
	
	BUNDESLIGA("Bundesliga"),
	LA_LIGA("La Liga"),
	LIGUE_1("Ligue 1"),
	PREMIER_LEAGUE("Premier Ligue"),
	SERIE_A("Serie A");
	
	String displayText;
	
	TournamentName(String displayText) {
		this.displayText= displayText;
	}
	
	public String getDisplayText() {
		return displayText;
	}
}
