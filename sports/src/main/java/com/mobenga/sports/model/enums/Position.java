package com.mobenga.sports.model.enums;

public enum Position {
	DEFENDER("Defender"),
	FORWARD("Forward"),
	MIDFIELDER("Midfielder");
	
	String displayText;
	
	Position(String displayText) {
		this.displayText= displayText;
	}
	
	public String getDisplayText() {
		return displayText;
	}

}
