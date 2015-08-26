package com.mobenga.sports.convert;

import com.mobenga.sports.model.SportsPerson;

public class BriefPersonDTO {


	private String firstName;
	private String lastName;
	private Long playerId;
	private String teamName;
	private Integer age;
	private Integer height;
	private Integer weight;
	private String positionText;
	private Integer apps;
	private Integer goal;
	private Integer assistTotal;
	private Integer redCard;
	private Integer yellowCard;

	
	public BriefPersonDTO() {
	}
	

	
	public BriefPersonDTO(BriefPersonDTO briefPersonDTO) {
		
		this.firstName = briefPersonDTO.firstName;
		this.lastName = briefPersonDTO.lastName;
		this.playerId = briefPersonDTO.playerId;
		this.teamName = briefPersonDTO.teamName;
		this.age = briefPersonDTO.age;
		this.height = briefPersonDTO.height;
		this.weight = briefPersonDTO.weight;
		this.positionText = briefPersonDTO.positionText;
		this.apps = briefPersonDTO.apps;
		this.goal = briefPersonDTO.goal;
		this.assistTotal = briefPersonDTO.assistTotal;
		this.redCard = briefPersonDTO.assistTotal;
		this.yellowCard = briefPersonDTO.yellowCard;
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

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
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

	public String getPositionText() {
		return positionText;
	}

	public void setPositionText(String positionText) {
		this.positionText = positionText;
	}

	public Integer getApps() {
		return apps;
	}

	public void setApps(Integer apps) {
		this.apps = apps;
	}

	public Integer getGoal() {
		return goal;
	}

	public void setGoal(Integer goal) {
		this.goal = goal;
	}

	public Integer getAssistTotal() {
		return assistTotal;
	}

	public void setAssistTotal(Integer assistTotal) {
		this.assistTotal = assistTotal;
	}

	public Integer getYellowCard() {
		return yellowCard;
	}

	public void setYellowCard(Integer yellowCard) {
		this.yellowCard = yellowCard;
	}

	public Integer getRedCard() {
		return redCard;
	}

	public void setRedCard(Integer redCard) {
		this.redCard = redCard;
	}

	public static BriefPersonDTO convert(SportsPerson sportsPerson) {
		BriefPersonDTO briefPersonDTO = new BriefPersonDTO();
		
		if(sportsPerson.getPlayerId() != null){
			briefPersonDTO.setPlayerId(sportsPerson.getPlayerId());
		}

		if(sportsPerson.getPersonalInformation() != null){

			if(sportsPerson.getPlayerId() != null){
				briefPersonDTO.setPlayerId(sportsPerson.getPlayerId());
			}
			if(sportsPerson.getPersonalInformation().getFirstName() != null){
				briefPersonDTO.setFirstName(sportsPerson.getPersonalInformation().getFirstName());
			}
			if(sportsPerson.getPersonalInformation().getLastName() != null){
				briefPersonDTO.setLastName(sportsPerson.getPersonalInformation().getLastName());
			}
			
			if(sportsPerson.getPersonalInformation().getTeamName() != null){
				briefPersonDTO.setTeamName(sportsPerson.getPersonalInformation().getTeamName());
			}
			
			if(sportsPerson.getPersonalInformation().getAge() != null){
				briefPersonDTO.setAge(sportsPerson.getPersonalInformation().getAge());
			}
			if(sportsPerson.getPersonalInformation().getHeight() != null){
				briefPersonDTO.setHeight(sportsPerson.getPersonalInformation().getHeight());
			}
			if(sportsPerson.getPersonalInformation().getWeight() != null){
				briefPersonDTO.setWeight(sportsPerson.getPersonalInformation().getWeight());
			}			
			
			if(sportsPerson.getPersonalInformation().getPositionText() != null){
				briefPersonDTO.setPositionText(sportsPerson.getPersonalInformation().getPositionText().getDisplayText());					
			}
		
		}
		
		if(sportsPerson.getMatchStatistics() != null){

			if(sportsPerson.getMatchStatistics().getApps() != null){
				briefPersonDTO.setApps(sportsPerson.getMatchStatistics().getApps());
			}
			if(sportsPerson.getMatchStatistics().getGoal() != null){
				briefPersonDTO.setGoal(sportsPerson.getMatchStatistics().getGoal());
			}
			if(sportsPerson.getMatchStatistics().getAssistTotal() != null){
				briefPersonDTO.setAssistTotal(sportsPerson.getMatchStatistics().getAssistTotal());
			}
			if(sportsPerson.getMatchStatistics().getYellowCard() != null){
				briefPersonDTO.setYellowCard(sportsPerson.getMatchStatistics().getYellowCard());
			}
			if(sportsPerson.getMatchStatistics().getRedCard() != null){
				briefPersonDTO.setRedCard(sportsPerson.getMatchStatistics().getRedCard());
			}
		}
		return briefPersonDTO;
	}




}
