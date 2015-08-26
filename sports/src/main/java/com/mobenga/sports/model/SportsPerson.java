package com.mobenga.sports.model;

public class SportsPerson {
	private LeaugueStats leaugueStats;
	private PersonalInformation personalInformation;
	private MatchStatistics matchStatistics;
	private Long playerId;
	
	public SportsPerson() {
		this.setLeaugueStats(new LeaugueStats());
		this.setPersonalInformation(new PersonalInformation());
		this.setMatchStatistics(new MatchStatistics());
	}

	public LeaugueStats getLeaugueStats() {
		return leaugueStats;
	}

	public void setLeaugueStats(LeaugueStats leaugueStats) {
		this.leaugueStats = leaugueStats;
	}

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}

	public MatchStatistics getMatchStatistics() {
		return matchStatistics;
	}

	public void setMatchStatistics(MatchStatistics matchStatistics) {
		this.matchStatistics = matchStatistics;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	
}
