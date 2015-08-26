package com.mobenga.sports.test;

import com.mobenga.sports.model.enums.Position;

public class Person {
	private String name;
	private Statistics stats;
	private Boolean result;
	//private Position position;
	
	public Person() {
		this.name = "Caner EREN";
		//this.setPosition(Position.DEFENDER);
		this.stats = new Statistics();
		this.result = true;
	}
	
	public Person(String name){
		this.name =name;
		this.stats = new Statistics();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Statistics getStats() {
		return stats;
	}
	public void setStats(Statistics stats) {
		this.stats = stats;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

//	public String getPosition() {
//		return position.toString();
//	}
//
//	public void setPosition(Position position) {
//		this.position = position;
//	}
	
	
	
}
