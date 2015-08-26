package com.mobenga.sports.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mobenga.sports.cache.CacheData;
import com.mobenga.sports.convert.BriefPersonDTO;
import com.mobenga.sports.convert.DetailedPersonDTO;
import com.mobenga.sports.exception.ResponseCodes;
import com.mobenga.sports.exception.ServiceRuntimeException;
import com.mobenga.sports.model.SportsPerson;
import com.mobenga.sports.util.FileUtil;
import com.mobenga.sports.util.ConvertUtil;

@Service
public class PersonService {
	
	final static Logger logger = LoggerFactory.getLogger(FileUtil.class);
	

	PersonService() {

	};

	
	public DetailedPersonDTO getDetailedPerson(String playerId){
		if(playerId != null){
		try {

				SportsPerson sportsPerson = CacheData.getInstance().getSportsPersonMap().get(Long.parseLong(playerId));
				if(sportsPerson != null){
					 return ConvertUtil.createDetailedDTOFromSportsPerson(sportsPerson);
				}else{
					logger.error("Player With selected Id = " + playerId + " not found");
					throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_NOT_FOUND);
		
				}
			
		}catch (NumberFormatException e){
			logger.error("Player Id = " + playerId + " is malformed...");
			throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_MALFORMED_ID);
		}catch(ServiceRuntimeException e){
			throw e; 
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_NOT_FOUND);

		}
		}else{
			logger.error("Player  not found");
			throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_NOT_FOUND);

		}
		
	}
	
	public  List<BriefPersonDTO> createBriefDTOList(){
		
		List<BriefPersonDTO> briefPersonDTOList = new ArrayList<BriefPersonDTO>();
		Map<Long, SportsPerson> sportsPersonMap = CacheData.getInstance().getSportsPersonMap();		
		BriefPersonDTO briefPersonDTO;

		try {
			if(sportsPersonMap != null && sportsPersonMap.size()>0){
				
				for(SportsPerson sportsPerson : sportsPersonMap.values()){
					briefPersonDTO = ConvertUtil.createBriefDTOFromSportsPerson(sportsPerson);
					briefPersonDTOList.add(briefPersonDTO);
				}
				
				return briefPersonDTOList;
			}else{
				throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_NOT_FOUND);
			}
		}catch( ServiceRuntimeException e)  {
			logger.error("There is not any sportsPerson in the sportsPersonMap" );
			throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_NOT_FOUND);
		}catch (Exception e) {
			logger.error(e.getMessage());
			throw new ServiceRuntimeException(ResponseCodes.SPORTS_PERSON_NOT_FOUND);
			
		}
	};
	

	
	
	
	
	
}



