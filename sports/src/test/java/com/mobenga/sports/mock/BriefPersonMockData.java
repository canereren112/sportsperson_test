package com.mobenga.sports.mock;

import java.util.ArrayList;
import java.util.List;

import com.mobenga.sports.convert.BriefPersonDTO;


public class BriefPersonMockData {
	public static BriefPersonDTO getBriefPersonFirst() {
		BriefPersonDTO dto = new BriefPersonDTO();
		dto.setFirstName("Wesley");
		dto.setLastName("Sneijder");
		dto.setAge(28);
		dto.setApps(20);
		dto.setAssistTotal(5);
		return dto;
	}

	public static BriefPersonDTO getBriefPersonSecond() {
		BriefPersonDTO dto = new BriefPersonDTO();
		dto.setFirstName("Robin");
		dto.setFirstName("Van Persie");
		dto.setAge(31);
		dto.setApps(10);
		dto.setAssistTotal(5);
		return dto;
	}

	public static List<BriefPersonDTO> getBriefPersonList() {
		List<BriefPersonDTO> list = new ArrayList<BriefPersonDTO>();
		list.add(getBriefPersonFirst());
		list.add(getBriefPersonSecond());
		return list;
	}
}
