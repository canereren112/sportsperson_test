package com.mobenga.sports.convert;

import com.mobenga.sports.model.SportsPerson;
import com.mobenga.sports.util.ViewUtil;

public class DetailedPersonDTO extends BriefPersonDTO{

	private Integer ranking;
	private Long seasonId; 
	private String seasonName;
	private Integer tournamentId;
	private Integer tournamentRegionId;
	private String tournamentRegionCode;
	private String regionCode;
	private String tournamentName;
	private String tournamentShortName;
	private Boolean isActive;
	private Boolean isOpta;
	private Long teamId;
	private String playedPositions;
	private Integer subOn;
	private Integer minsPlayed;
	private Double rating;
	private Double shotsPerGame;
	private Double aerialWonPerGame;
	private Integer manOfTheMatch;
	private String name;
	private Boolean isManOfTheMatch;
	private String playedPositionsShort;
	private double passSuccess;
	
	public DetailedPersonDTO() {
	}
	
	public DetailedPersonDTO(BriefPersonDTO briefDTO) {
		super(briefDTO);
	}
	
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

	public String getTournamentRegionCode() {
		return tournamentRegionCode;
	}

	public void setTournamentRegionCode(String tournamentRegionCode) {
		this.tournamentRegionCode = tournamentRegionCode;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getTournamentShortName() {
		return tournamentShortName;
	}

	public void setTournamentShortName(String tournamentShortName) {
		this.tournamentShortName = tournamentShortName;
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


	public String getPlayedPositions() {
		return playedPositions;
	}

	public void setPlayedPositions(String playedPositions) {
		this.playedPositions = playedPositions;
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

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getShotsPerGame() {
		return shotsPerGame;
	}

	public void setShotsPerGame(Double shotsPerGame) {
		this.shotsPerGame = shotsPerGame;
	}

	public Double getAerialWonPerGame() {
		return aerialWonPerGame;
	}

	public void setAerialWonPerGame(Double aerialWonPerGame) {
		this.aerialWonPerGame = aerialWonPerGame;
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

	public double getPassSuccess() {
		return passSuccess;
	}

	public void setPassSuccess(double passSuccess) {
		this.passSuccess = passSuccess;
	}

	public static DetailedPersonDTO convert(SportsPerson sportsPerson) {
		DetailedPersonDTO detailedPersonDTO ;
		
		detailedPersonDTO = new DetailedPersonDTO(BriefPersonDTO.convert(sportsPerson));
		
		if(sportsPerson.getLeaugueStats() != null){
			if( sportsPerson.getLeaugueStats().getRanking() != null){
				detailedPersonDTO.setRanking(sportsPerson.getLeaugueStats().getRanking());
			}
			if( sportsPerson.getLeaugueStats().getSeasonId() != null){
				detailedPersonDTO.setSeasonId(sportsPerson.getLeaugueStats().getSeasonId());
			}
			if( sportsPerson.getLeaugueStats().getSeasonName() != null){
				detailedPersonDTO.setSeasonName(sportsPerson.getLeaugueStats().getSeasonName());
			}
			if( sportsPerson.getLeaugueStats().getTournamentId() != null){
				detailedPersonDTO.setTournamentId(sportsPerson.getLeaugueStats().getTournamentId());
			}
			if( sportsPerson.getLeaugueStats().getTournamentRegionId() != null){
				detailedPersonDTO.setTournamentRegionId(sportsPerson.getLeaugueStats().getTournamentRegionId());
			}
			if( sportsPerson.getLeaugueStats().getTournamentRegionCode() != null){
				detailedPersonDTO.setTournamentRegionCode(ViewUtil.getCountryCodesString(sportsPerson.getLeaugueStats().getTournamentRegionCode()));
			}
			if( sportsPerson.getLeaugueStats().getRegionCode() != null){
				detailedPersonDTO.setRegionCode(ViewUtil.getCountryCodesString(sportsPerson.getLeaugueStats().getRegionCode()));
			}
			if( sportsPerson.getLeaugueStats().getTournamentName() != null){
				detailedPersonDTO.setTournamentName(sportsPerson.getLeaugueStats().getTournamentName().getDisplayText());
			}
			if( sportsPerson.getLeaugueStats().getTournamentShortName() != null){
				detailedPersonDTO.setTournamentShortName(sportsPerson.getLeaugueStats().getTournamentShortName().toString());
			}
		}
		
		if(sportsPerson.getPersonalInformation() != null){
			
			

			if(sportsPerson.getPersonalInformation().getIsActive() != null){
				detailedPersonDTO.setIsActive(sportsPerson.getPersonalInformation().getIsActive());
			}
			if(sportsPerson.getPersonalInformation().getIsOpta() != null){
				detailedPersonDTO.setIsOpta(sportsPerson.getPersonalInformation().getIsOpta());
			}
			if(sportsPerson.getPersonalInformation().getTeamId() != null){
				detailedPersonDTO.setTeamId(sportsPerson.getPersonalInformation().getTeamId());
			}
			
			if(sportsPerson.getPersonalInformation().getPlayedPositionList() != null && sportsPerson.getPersonalInformation().getPlayedPositionList().size()>0){
				detailedPersonDTO.setPlayedPositions(ViewUtil.getPlayedPositionsString(sportsPerson.getPersonalInformation().getPlayedPositionList()));
			}

		}

		if(sportsPerson.getMatchStatistics() != null){
			
			if(sportsPerson.getMatchStatistics().getSubOn() != null){
				detailedPersonDTO.setSubOn(sportsPerson.getMatchStatistics().getSubOn());
			}
			if(sportsPerson.getMatchStatistics().getMinsPlayed() != null){
				detailedPersonDTO.setMinsPlayed(sportsPerson.getMatchStatistics().getMinsPlayed());
			}				
			if(sportsPerson.getMatchStatistics().getManOfTheMatch() != null){
				detailedPersonDTO.setManOfTheMatch(sportsPerson.getMatchStatistics().getManOfTheMatch());
			}
			if(sportsPerson.getMatchStatistics().getName() != null){
				detailedPersonDTO.setName(sportsPerson.getMatchStatistics().getName());
			}
			if(sportsPerson.getMatchStatistics().getIsManOfTheMatch() != null){
				detailedPersonDTO.setIsManOfTheMatch(sportsPerson.getMatchStatistics().getIsManOfTheMatch());
			}
			if(sportsPerson.getMatchStatistics().getPlayedPositionsShort() != null){
				detailedPersonDTO.setPlayedPositionsShort(sportsPerson.getMatchStatistics().getPlayedPositionsShort());
			}
			
			
			if(sportsPerson.getMatchStatistics().getRatioInformation() != null){
				if(sportsPerson.getMatchStatistics().getRatioInformation().getRating() != null){
					detailedPersonDTO.setRating(sportsPerson.getMatchStatistics().getRatioInformation().getRating());
				}
				if(sportsPerson.getMatchStatistics().getRatioInformation().getShotsPerGame() != null){
					detailedPersonDTO.setShotsPerGame(sportsPerson.getMatchStatistics().getRatioInformation().getShotsPerGame());
				}
				if(sportsPerson.getMatchStatistics().getRatioInformation().getAerialWonPerGame() != null){
					detailedPersonDTO.setAerialWonPerGame(sportsPerson.getMatchStatistics().getRatioInformation().getAerialWonPerGame());
				}
				if(sportsPerson.getMatchStatistics().getRatioInformation().getPassSuccess() != null){
					detailedPersonDTO.setPassSuccess(sportsPerson.getMatchStatistics().getRatioInformation().getPassSuccess());
				}
			}

		}
		return detailedPersonDTO;
	}

}
