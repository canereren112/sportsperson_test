package com.mobenga.sports.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.mobenga.sports.convert.BriefPersonDTO;
import com.mobenga.sports.convert.DetailedPersonDTO;
import com.mobenga.sports.exception.ResponseCodes;
import com.mobenga.sports.exception.ServiceResponse;
import com.mobenga.sports.exception.ServiceRuntimeException;
import com.mobenga.sports.service.PersonService;
import com.mobenga.sports.util.FileUtil;







@Controller
@RequestMapping("/api")
public class PersonRestController {
	   final static Logger logger = LoggerFactory.getLogger(FileUtil.class);
	   
	   	@Autowired
	   	PersonService personService;
	   
		@RequestMapping(value = "/players", method = RequestMethod.GET)
		public @ResponseBody 
		List<BriefPersonDTO> getBriefPersonList() {
			
	 		return 	 personService.createBriefDTOList();

	    }
	
		@RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
		public @ResponseBody
		DetailedPersonDTO getDetailedPerson(@PathVariable String id){
				
			return personService.getDetailedPerson(id);
		}
		
		@ExceptionHandler(ServiceRuntimeException.class)
		@ResponseBody
		public ServiceResponse handleServiceRuntimeException(HttpServletRequest req, Exception ex) {
			logger.error("Error during process request", ex);
			ServiceResponse error = new ServiceResponse((ServiceRuntimeException) ex);
			return error;
		}

		
		@ExceptionHandler(Exception.class)
		@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
		@ResponseBody
		public ServiceResponse handleUnexpectedException(HttpServletRequest req, Exception ex) {
			logger.error("Error during process request", ex);
			ServiceResponse error = new ServiceResponse(ResponseCodes.ERROR);
			return error;
		}
}
