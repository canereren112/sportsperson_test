package com.mobenga.sports.model;

import java.util.List;

import com.mobenga.sports.model.enums.CountryCodes;
import com.mobenga.sports.model.enums.TournamentName;
import com.mobenga.sports.model.enums.TournamentShortName;

public class LeaugueStats {
	
	private Integer ranking;
	private Long seasonId; 
	private String seasonName;
	private Integer tournamentId;
	private Integer tournamentRegionId;
	private List<CountryCodes> tournamentRegionCode;
	private List<CountryCodes>  regionCode;
	private TournamentName tournamentName;
	private TournamentShortName tournamentShortName;
	
	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public Long getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(Long seasonId) {
		this.seasonId = seasonId;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public Integer getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(Integer tournamentId) {
		this.tournamentId = tournamentId;
	}

	public Integer getTournamentRegionId() {
		return tournamentRegionId;
	}

	public void setTournamentRegionId(Integer tournamentRegionId) {
		this.tournamentRegionId = tournamentRegionId;
	}

	public List<CountryCodes> getTournamentRegionCode() {
		return tournamentRegionCode;
	}
	
	public void setTournamentRegionCode(List<CountryCodes> tournamentRegionCode) {
		this.tournamentRegionCode = tournamentRegionCode;
	}
	
	public List<CountryCodes> getRegionCode() {
		return regionCode;
	}
	
	public void setRegionCode(List<CountryCodes> regionCode) {
		this.regionCode = regionCode;
	}

	public TournamentName getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(TournamentName tournamentName) {
		this.tournamentName = tournamentName;
	}

	public TournamentShortName getTournamentShortName() {
		return tournamentShortName;
	}

	public void setTournamentShortName(TournamentShortName tournamentShortName) {
		this.tournamentShortName = tournamentShortName;
	}


}
