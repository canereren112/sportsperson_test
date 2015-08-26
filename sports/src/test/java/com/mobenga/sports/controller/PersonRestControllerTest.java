package com.mobenga.sports.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import com.mobenga.sports.convert.BriefPersonDTO;
import com.mobenga.sports.convert.DetailedPersonDTO;
import com.mobenga.sports.mock.BriefPersonMockData;
import com.mobenga.sports.mock.DetailedPersonMockData;
import com.mobenga.sports.service.PersonService;
import com.mobenga.sports.util.FileUtil;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


public class PersonRestControllerTest extends AbstractRestControllerTest {
	final static Logger logger = LoggerFactory.getLogger(PersonRestControllerTest.class);

	@Test
	public void getBriefPersonListTest() throws Exception {
		List<BriefPersonDTO> briefPersonList = BriefPersonMockData.getBriefPersonList();

		when(personServiceMock.createBriefDTOList()).thenReturn(briefPersonList);

		mockMvc.perform(get("/api//players")).andExpect(status().isOk())
				.andExpect(content().contentType(APPLICATION_JSON_UTF8))
				.andExpect(jsonPath("$", hasSize(2)))
				.andExpect(jsonPath("$[0].firstName", is(BriefPersonMockData.getBriefPersonFirst().getFirstName())))
				.andExpect(jsonPath("$[0].lastName", is(BriefPersonMockData.getBriefPersonFirst().getLastName())))
				.andExpect(jsonPath("$[0].age", is(BriefPersonMockData.getBriefPersonFirst().getAge())))
				.andExpect(jsonPath("$[0].apps", is(BriefPersonMockData.getBriefPersonFirst().getApps())))
				.andExpect(jsonPath("$[0].assistTotal", is(BriefPersonMockData.getBriefPersonFirst().getAssistTotal())))
				.andExpect(jsonPath("$[1].firstName", is(BriefPersonMockData.getBriefPersonSecond().getFirstName())))
				.andExpect(jsonPath("$[1].lastName", is(BriefPersonMockData.getBriefPersonSecond().getLastName())))
				.andExpect(jsonPath("$[1].age", is(BriefPersonMockData.getBriefPersonSecond().getAge())))
				.andExpect(jsonPath("$[1].apps", is(BriefPersonMockData.getBriefPersonSecond().getApps())))
				.andExpect(jsonPath("$[1].assistTotal", is(BriefPersonMockData.getBriefPersonSecond().getAssistTotal())));

		verify(personServiceMock, times(1)).createBriefDTOList();
		verifyNoMoreInteractions(personServiceMock);

	}

	@Test
	public void getDetailedPersonTest() throws Exception {
		String id = "1234";
		
		
		when(personServiceMock.getDetailedPerson(id)).thenReturn(DetailedPersonMockData.getDetailedPersonMockData());
		mockMvc.perform(get("/api/player/"+id)).andExpect(status().isOk())
											.andExpect(content().contentType(APPLICATION_JSON_UTF8))
											.andExpect(jsonPath("$firstName", is(DetailedPersonMockData.getDetailedPersonMockData().getFirstName())))
											.andExpect(jsonPath("$lastName", is(DetailedPersonMockData.getDetailedPersonMockData().getLastName())))
											.andExpect(jsonPath("$playerId", is(DetailedPersonMockData.getDetailedPersonMockData().getPlayerId().toString())));
		verifyNoMoreInteractions(personServiceMock);
	}							

}
