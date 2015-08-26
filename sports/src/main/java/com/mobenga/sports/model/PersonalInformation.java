package com.mobenga.sports.model;

import java.util.ArrayList;
import java.util.List;

import com.mobenga.sports.model.enums.PlayedPosition;
import com.mobenga.sports.model.enums.Position;

public class PersonalInformation {
	private String firstName;
	private String lastName;
	private Boolean isActive;
	private Boolean isOpta;
	private Long teamId;
	private String teamName;
	private List<PlayedPosition> playedPositionList;
	private Integer age;
	private Integer height;
	private Integer weight;
	private Position positionText;
	
	public PersonalInformation() {		
		this.setPlayedPositionList(new ArrayList<PlayedPosition>());
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsOpta() {
		return isOpta;
	}

	public void setIsOpta(Boolean isOpta) {
		this.isOpta = isOpta;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Position getPositionText() {
		return positionText;
	}
	
	public void setPositionText(Position positionText) {
		this.positionText = positionText;
	}
	public List<PlayedPosition> getPlayedPositionList() {
		return playedPositionList;
	}
	public void setPlayedPositionList(List<PlayedPosition> playedPositionList) {
		this.playedPositionList = playedPositionList;
	}
	

}
