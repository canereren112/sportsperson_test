package com.mobenga.sports.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobenga.sports.configuration.SportConfigConstants;
import com.mobenga.sports.convert.BriefPersonDTO;
import com.mobenga.sports.convert.DetailedPersonDTO;
import com.mobenga.sports.exception.ResponseCodes;
import com.mobenga.sports.exception.ServiceRuntimeException;
import com.mobenga.sports.model.SportsPerson;

public class ConvertUtil {
	
	final static Logger logger = LoggerFactory.getLogger(FileUtil.class);
	
	public static String checkAndEraseQuotationMark(String line){
		StringBuilder result = new StringBuilder();
		try {
			if(line.contains("\"")){
				result.append(line.substring(0, line.indexOf("\"")));
		
				String tempString[] = line.substring(line.indexOf("\"") +1, line.lastIndexOf("\"")).split(SportConfigConstants.CVS_COMMA_SEPERATOR);
				
				for (int i=0; i < tempString.length; i++){
					result.append(tempString[i]);
					if(i < (tempString.length-1)){//Dont need to add for the last occurence
						result.append("-");
					}
				}
				
				result.append(line.substring(line.lastIndexOf("\"")+1));
				return result.toString();
			}else {
				return line;
			}
			
		} catch (Exception e) {
			logger.error(e.getMessage());
			
		}
		
		return null;
		
	};
	
	
	 public static DetailedPersonDTO createDetailedDTOFromSportsPerson(SportsPerson sportsPerson){
		 
			DetailedPersonDTO detailedPersonDTO = new DetailedPersonDTO();
			
			if(sportsPerson!= null){
	
				try{
					
					if(sportsPerson.getLeaugueStats()==null) {
						logger.warn("The sportPerson's leaugueStats not exists. Player ID = " + sportsPerson.getPlayerId());
					}
					
					if(sportsPerson.getPersonalInformation() == null){	
						logger.warn("The sportPerson's personalInformation does not exists. Player ID = " + sportsPerson.getPlayerId());
					}
					
					if(sportsPerson.getMatchStatistics() == null){
						logger.warn("The sportPerson's matchStats does not exists. Player ID = " + sportsPerson.getPlayerId());
					}
					
					if(sportsPerson.getMatchStatistics() != null && sportsPerson.getMatchStatistics().getRatioInformation() == null){
						logger.warn("The sportPerson's match ratioInformation does not exist. Player ID = " + sportsPerson.getPlayerId());
					}
					

					detailedPersonDTO = DetailedPersonDTO.convert(sportsPerson);
	

					return detailedPersonDTO;
					
				
				}catch(Exception e){
					logger.error(e.getMessage());
					throw new ServiceRuntimeException(ResponseCodes.ERROR);
				}
			}else{
				logger.error("The sportPerson does not exists...");
				throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_NOT_FOUND);
			}
		}
		
		
	  public static  BriefPersonDTO  createBriefDTOFromSportsPerson( SportsPerson sportsPerson){
			BriefPersonDTO briefPersonDTO = new BriefPersonDTO();
			
		
			if(sportsPerson!= null){
				try {
				if(sportsPerson.getPersonalInformation() == null){	
					logger.warn("The sportPerson's personalInformation does not exists. Player ID = " + sportsPerson.getPlayerId());
				}
				
				if(sportsPerson.getMatchStatistics() == null){
					logger.warn("The sportPerson's matchStats does not exists. Player ID = " + sportsPerson.getPlayerId());
				}
				
				briefPersonDTO = BriefPersonDTO.convert(sportsPerson);
				return briefPersonDTO;				
			
				}catch (Exception e) {
					logger.error(e.getMessage());
					throw new ServiceRuntimeException(ResponseCodes.ERROR);
		
				}
			}else{
				logger.error("The sportPerson does not exists...");
				throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_NOT_FOUND);
			}
	  }
}
