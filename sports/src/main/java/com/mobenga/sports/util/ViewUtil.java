package com.mobenga.sports.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobenga.sports.model.enums.CountryCodes;
import com.mobenga.sports.model.enums.PlayedPosition;

public class ViewUtil {
	   final static Logger logger = LoggerFactory.getLogger(FileUtil.class);
	   
	   public static String getPlayedPositionsString(List<PlayedPosition> playedPositionList){
		 StringBuilder result = new StringBuilder();
		 try {
			  for(int i = 0; i < playedPositionList.size() ; i++){
				   
				   result.append(playedPositionList.get(i).toString());
				   
				   if(i != (playedPositionList.size()-1)){//No need to add " " for last item
					   result.append(" ");
				   }
			   }
			   return result.toString();

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
		 
		   
	   }
	   
	   public static String getCountryCodesString(List<CountryCodes> countryCodesList){
			 StringBuilder result = new StringBuilder();
			 try {
				 for(int i = 0; i < countryCodesList.size() ; i++){
					   
					   result.append(countryCodesList.get(i).toString());
					   
					   if(i != (countryCodesList.size()-1)){//No need to add " " for last item
						   result.append("/");
					   }
				   }
				   
				   return result.toString();
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
			
			 return null;
			   
		   }
}
