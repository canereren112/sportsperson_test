package com.mobenga.sports.cache;

import java.util.Map;

import com.mobenga.sports.model.SportsPerson;
import com.mobenga.sports.util.FileUtil;

public class CacheData {

	private Map<Long, SportsPerson> sportsPersonMap;
	
	private static CacheData instance;

	CacheData() {
		this.setSportsPersonMap(FileUtil.readSportsTextFile()); 
	};

	public static synchronized CacheData getInstance() {
		if (instance == null)
			instance = new CacheData();
		return instance;
	}

	public Map<Long, SportsPerson> getSportsPersonMap() {
		return sportsPersonMap;
	}

	public void setSportsPersonMap(Map<Long, SportsPerson> sportsPersonMap) {
		this.sportsPersonMap = sportsPersonMap;
	}


}
