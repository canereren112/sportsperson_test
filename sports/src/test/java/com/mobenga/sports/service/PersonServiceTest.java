package com.mobenga.sports.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mobenga.sports.cache.CacheData;
import com.mobenga.sports.convert.BriefPersonDTO;
import com.mobenga.sports.convert.DetailedPersonDTO;
import com.mobenga.sports.model.SportsPerson;
import com.mobenga.sports.util.FileUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:**/mvc-dispatcher-servlet-test.xml" })
@WebAppConfiguration
public class PersonServiceTest {
	
	final static Logger logger = LoggerFactory.getLogger(FileUtil.class);
	
   	@Autowired
   	PersonService personService;

   	
	
	@Test
	public void createBriefDTOTest(){
		
		List<BriefPersonDTO> briefList = personService.createBriefDTOList();
		
		Assert.assertNotNull(briefList);
	}
	
	
	@Test
	public void getDetailedPersonTest(){
		String playerId = "5583";

		DetailedPersonDTO  detailedPersonDTO = personService.getDetailedPerson(playerId);
		Assert.assertNotNull(detailedPersonDTO);
	}
}



