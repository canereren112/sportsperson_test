package com.mobenga.sports.mock;

import static org.mockito.Mockito.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mobenga.sports.service.PersonService;

@Configuration
public class MockConfigurer {

	@Bean
	@Primary
	public PersonService registerMock() {
		return mock(PersonService.class);
	}
}