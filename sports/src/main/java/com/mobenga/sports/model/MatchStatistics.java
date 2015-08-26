package com.mobenga.sports.model;

public class MatchStatistics {
	private Integer apps;
	private Integer subOn;
	private Integer minsPlayed;
	private Integer goal;
	private Integer assistTotal;
	private Integer yellowCard;
	private Integer redCard;
	private Integer manOfTheMatch;
	private String name;
	private Boolean isManOfTheMatch;
	private String playedPositionsShort;
	private RatioInformation ratioInformation;
	
	
	public MatchStatistics() {
		this.ratioInformation = new RatioInformation();
	}
	
	public Integer getApps() {
		return apps;
	}

	public void setApps(Integer apps) {
		this.apps = apps;
	}

	public Integer getSubOn() {
		return subOn;
	}

	public void setSubOn(Integer subOn) {
		this.subOn = subOn;
	}

	public Integer getMinsPlayed() {
		return minsPlayed;
	}

	public void setMinsPlayed(Integer minsPlayed) {
		this.minsPlayed = minsPlayed;
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
	
	public Integer getManOfTheMatch() {
		return manOfTheMatch;
	}

	public void setManOfTheMatch(Integer manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsManOfTheMatch() {
		return isManOfTheMatch;
	}

	public void setIsManOfTheMatch(Boolean isManOfTheMatch) {
		this.isManOfTheMatch = isManOfTheMatch;
	}

	public String getPlayedPositionsShort() {
		return playedPositionsShort;
	}

	public void setPlayedPositionsShort(String playedPositionsShort) {
		this.playedPositionsShort = playedPositionsShort;
	}

	public RatioInformation getRatioInformation() {
		return ratioInformation;
	}

	public void setRatioInformation(RatioInformation ratioInformation) {
		this.ratioInformation = ratioInformation;
	}
}
