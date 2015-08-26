package com.mobenga.sports.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobenga.sports.configuration.SportConfigConstants;
import com.mobenga.sports.exception.ResponseCodes;
import com.mobenga.sports.exception.ServiceRuntimeException;
import com.mobenga.sports.model.SportsPerson;

public class FileUtil {
	
	   final static Logger logger = LoggerFactory.getLogger(FileUtil.class);

	
public static Map<Long, SportsPerson> readSportsTextFile(){
		BufferedReader br  = null;
		String line = "";
		Map<Long,SportsPerson> sportsPersonMap = new HashMap<Long,SportsPerson>();
		
		if (logger.isDebugEnabled()) {
			logger.debug("Parsing " + SystemConfigUtil.getPlayersDataFile() + " ...");
		}
		try {
			br = new BufferedReader(  new InputStreamReader( new FileInputStream(new File(SystemConfigUtil.getPlayersDataFile()  )), "UTF-8"));

			boolean isFirstLineRead = false;
			while ((line = br.readLine()) != null) {				
				
				
				if(isFirstLineRead){
					String[] lineData = ConvertUtil.checkAndEraseQuotationMark(line).split(SportConfigConstants.CVS_COMMA_SEPERATOR);
					addLinesToPersonMap(sportsPersonMap, lineData);
				}
				
				isFirstLineRead = true;
				
			}
			
			return sportsPersonMap;
	 
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			throw new ServiceRuntimeException(ResponseCodes.FILE_NOT_FOUND_ERROR);
		} catch (IOException e) {
			logger.error(e.getMessage());
			throw new ServiceRuntimeException(ResponseCodes.INPUT_OUTPUT_ERROR);
		}catch (Exception e){
			logger.error(e.getMessage());
			throw new ServiceRuntimeException(ResponseCodes.FILE_READ_ERROR);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
			}
		}
	 
		
	}

	private static void addLinesToPersonMap(Map<Long, SportsPerson> sportsPersonMap,String[] lineData ){
		SportsPerson person = new SportsPerson();
		try {
			if(lineData!=null && lineData.length>0){
				if(lineData[0]!=null){
					person.getLeaugueStats().setRanking(Integer.parseInt(lineData[0]));
				}				
				if(lineData[1]!=null){
					person.getLeaugueStats().setSeasonId(Long.parseLong(lineData[1]));
				}				
				if(lineData[2]!=null){				
					person.getLeaugueStats().setSeasonName(lineData[2]);
				}				
				if(lineData[3]!=null){
					person.getLeaugueStats().setTournamentId(Integer.parseInt(lineData[3]));
				}				
				if(lineData[4]!=null){		
					person.getLeaugueStats().setTournamentRegionId(Integer.parseInt(lineData[4]));
				}				
				if(lineData[5]!=null){				
					person.getLeaugueStats().setTournamentRegionCode(EnumUtil.getCountryCodesEnumList(lineData[5]));
				}				
				if(lineData[6]!=null){
					person.getLeaugueStats().setRegionCode(EnumUtil.getCountryCodesEnumList(lineData[6]));
				}							
				if(lineData[7]!=null){
					person.getLeaugueStats().setTournamentName(EnumUtil.getTournamentNameEnum(lineData[7]));
				}				
				if(lineData[8]!=null){
					person.getLeaugueStats().setTournamentShortName(EnumUtil.getTournamentShortNameEnum(lineData[8]));
				}				
				if(lineData[9]!=null){
					person.getPersonalInformation().setFirstName(lineData[9]);
				}
				if(lineData[10]!=null){					
					person.getPersonalInformation().setLastName(lineData[10]);
				}
				if(lineData[11]!=null){
					person.setPlayerId(Long.parseLong(lineData[11]));
				}
				if(lineData[12]!=null){
					person.getPersonalInformation().setIsActive(EnumUtil.getBooleanFromString(lineData[12]));
				}
				if(lineData[13]!=null){
					person.getPersonalInformation().setIsOpta(EnumUtil.getBooleanFromString(lineData[13]));
				}
				if(lineData[14]!=null){
					person.getPersonalInformation().setTeamId(Long.parseLong(lineData[14]));
				}
				if(lineData[15]!=null){
					person.getPersonalInformation().setTeamName(lineData[15]);
				}
				if(lineData[16]!=null){
					person.getPersonalInformation().setPlayedPositionList(EnumUtil.getPlayedPositonsEnumList(lineData[16]));
				}
				if(lineData[17]!=null){
					person.getPersonalInformation().setAge(Integer.parseInt(lineData[17]));
				}
				if(lineData[18]!=null){
					person.getPersonalInformation().setHeight(Integer.parseInt(lineData[18]));
				}
				if(lineData[19]!=null){
					person.getPersonalInformation().setWeight(Integer.parseInt(lineData[19]));
				}
				if(lineData[20]!=null){
					person.getPersonalInformation().setPositionText(EnumUtil.getPositionEnum(lineData[20]));
				}
				if(lineData[21]!=null){
					person.getMatchStatistics().setApps(Integer.parseInt(lineData[21]));
				}
				if(lineData[22]!=null){
					person.getMatchStatistics().setSubOn(Integer.parseInt(lineData[22]));
				}
				if(lineData[23]!=null){
					person.getMatchStatistics().setMinsPlayed(Integer.parseInt(lineData[23]));
				}
				if(lineData[24]!=null){
					person.getMatchStatistics().getRatioInformation().setRating(Double.parseDouble(lineData[24]));
				}
				if(lineData[25]!=null){
					person.getMatchStatistics().setGoal(Integer.parseInt(lineData[25]));
				}
				if(lineData[26]!=null){
					person.getMatchStatistics().setAssistTotal(Integer.parseInt(lineData[26]));
				}
				if(lineData[27]!=null){
					person.getMatchStatistics().setYellowCard(Integer.parseInt(lineData[27]));
				}
				if(lineData[28]!=null){
					person.getMatchStatistics().setRedCard(Integer.parseInt(lineData[28]));
				}
				if(lineData[29]!=null){
					person.getMatchStatistics().getRatioInformation().setShotsPerGame(Double.parseDouble(lineData[29]));
				}
				if(lineData[30]!=null){
					person.getMatchStatistics().getRatioInformation().setAerialWonPerGame(Double.parseDouble(lineData[30]));
				}
				if(lineData[31]!=null){
					person.getMatchStatistics().setManOfTheMatch(Integer.parseInt(lineData[31]));
				}
				if(lineData[32]!=null){
					person.getMatchStatistics().setName(lineData[32]);
				}
				if(lineData[33]!=null){
					person.getMatchStatistics().setIsManOfTheMatch(EnumUtil.getBooleanFromString(lineData[33]));
				}
				if(lineData[34]!=null){
					person.getMatchStatistics().setPlayedPositionsShort(lineData[34]);
				}
				if(lineData[35]!=null){
					person.getMatchStatistics().getRatioInformation().setPassSuccess(Double.parseDouble(lineData[35]));
				}
				
				sportsPersonMap.put(person.getPlayerId(), person);
			}
			
		}catch(NumberFormatException e){
			logger.error(e.getMessage());
			throw new ServiceRuntimeException(ResponseCodes.NUMBER_FORMAT_ERROR);
		}catch(IndexOutOfBoundsException e){
			logger.error(e.getMessage());
			throw new ServiceRuntimeException(ResponseCodes.DATA_EXCEEDS_ERROR);
		}catch (Exception e) {
			logger.error(e.getMessage());
			throw new ServiceRuntimeException(ResponseCodes.ERROR);
		}
		
	}
	
}