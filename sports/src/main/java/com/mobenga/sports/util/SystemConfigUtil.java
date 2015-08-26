package com.mobenga.sports.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobenga.sports.configuration.SportConfigConstants;

public class SystemConfigUtil {
	
	final static Logger logger = LoggerFactory.getLogger(FileUtil.class);
	
	   public static String getPlayersDataFile(){
		return SportConfigConstants.SPORTS_PERSON_RESOURCE_PATH + SportConfigConstants.SPORTS_PERSON_FILE_NAME;
	}
}
