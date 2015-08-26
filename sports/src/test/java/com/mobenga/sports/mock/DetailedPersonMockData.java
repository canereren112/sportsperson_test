package com.mobenga.sports.mock;

import com.mobenga.sports.convert.DetailedPersonDTO;

public class DetailedPersonMockData {
	public static DetailedPersonDTO getDetailedPersonMockData() {
		DetailedPersonDTO dto = new DetailedPersonDTO();
	
		dto.setFirstName("Wesley");
		dto.setLastName("Sneijder");
		dto.setAge(28);
		dto.setApps(20);
		dto.setAssistTotal(5);
		dto.setPlayerId(new Long (1234));
		return dto;
	}
}
