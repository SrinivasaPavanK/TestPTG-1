package com.trinet.aboutme.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.dtos.EmergencyContactDTO;
import com.trinet.aboutme.service.EmergencyContactService;

/**
 * 
 * @author Srinivasa Pavan
 *
 */
@RestController
public class TrinetLoginControllerImpl implements TrinetLoginController{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TrinetLoginControllerImpl.class);

	@Autowired
	private EmergencyContactService emergencyContactService;
	

}
