package com.mobenga.sports.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobenga.sports.configuration.SportConfigConstants;
import com.mobenga.sports.model.enums.CountryCodes;
import com.mobenga.sports.model.enums.PlayedPosition;
import com.mobenga.sports.model.enums.Position;
import com.mobenga.sports.model.enums.TournamentName;
import com.mobenga.sports.model.enums.TournamentShortName;

public class EnumUtil {
	
	final static Logger logger = LoggerFactory.getLogger(FileUtil.class);

	public static Boolean getBooleanFromString(String data){
		
		if(data != null){
			
			if("TRUE".equals(data)){
				return true;
			}else if("FALSE".equals(data)){
				return false;
			}
			
		}
		return null;
	}
	
	public static TournamentName getTournamentNameEnum(String data){
		
		if(data != null){
			
			if("Bundesliga".equals(data)){
				return TournamentName.BUNDESLIGA;
			}else if("La Liga".equals(data)){
				return TournamentName.LA_LIGA;
			}else if("Ligue 1".equals(data)){
				return TournamentName.LIGUE_1;
			}else if("Premier League".equals(data)){
				return TournamentName.PREMIER_LEAGUE;
			}else if("Serie A".equals(data)){
				return TournamentName.SERIE_A;
				
			}
		}
		return null;
	}
	
	public static TournamentShortName getTournamentShortNameEnum(String data){
		if(data != null){
			
			if("EPL".equals(data)){
				return TournamentShortName.EPL;
			}else if("FL1".equals(data)){
				return TournamentShortName.FL1;
			}else if("GB".equals(data)){
				return TournamentShortName.GB;
			}else if("ISA".equals(data)){
				return TournamentShortName.ISA;
			}else if("SLL".equals(data)){
				return TournamentShortName.SLL;
			}
			
		}
		return null;
	}
	
	public static Position getPositionEnum(String data){
		
		if(data != null){
			
			if("Defender".equals(data)){
				return Position.DEFENDER;
			}else if("Forward".equals(data)){
				return Position.FORWARD;
			}else if("Midfielder".equals(data)){
				return Position.MIDFIELDER;
			}
			
		}
		return null;
	}
	
	public static List<PlayedPosition> getPlayedPositonsEnumList(String data){

		List<PlayedPosition> playedPositionsList= new ArrayList<PlayedPosition>();
		
		String tempString[] = data.split(SportConfigConstants.HYPHEN_SEPERATOR);
		
		for (int i=0; i < tempString.length; i++){
			if("AMC".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.AMC);
			}else if("AML".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.AML);
			}if("AMR".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.AMR);
			}else if("DC".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.DC);
			}else if("DL".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.DL);
			}else if("DMC".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.DMC);
			}else if("FW".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.FW);
			}else if("MC".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.MC);
			}else if("ML".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.ML);
			}else if("MR".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.MR);
			}
		}
		return 	playedPositionsList;
	}
	
	public static List<CountryCodes> getCountryCodesEnumList(String data){

		List<CountryCodes> countryCodesList= new ArrayList<CountryCodes>();
		
		String tempString[] = data.split(SportConfigConstants.HYPHEN_SEPERATOR);
		
		for (int i=0; i < tempString.length; i++){
			if("AR".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.AR);
			}else if("BE".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.BE);
			}if("BR".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.BR);
			}else if("CL".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.CL);
			}else if("CO".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.CO);
			}else if("DE".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.DE);
			}else if("ES".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.ES);
			}else if("FR".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.FR);
			}else if("GB".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.GB);
			}else if("ENG".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.ENG);
			}else if("WLS".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.WLS);
			}else if("IT".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.IT);
			}else if("NL".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.NL);
			}else if("PT".equals(tempString[i].toUpperCase())){
				countryCodesList.add(CountryCodes.PT);
			}
		
		}
		return 	countryCodesList;
	}
}
