package com.trinet.aboutme.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.trinet.aboutme.dtos.EmployeeOptionsDTO;
import com.trinet.aboutme.service.EmployeeOptionsService;
/**
 * 
 * @author Srinivasa Pavan
 *
 */

public class EmployeeOptionsControllerImpl implements EmployeeOptionsController{
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeOptionsControllerImpl.class);
	@Autowired
	private EmployeeOptionsService employeeOptionsService;	
	

	@Override
	public List<EmployeeOptionsDTO> updateEmployeeOptions(Object obj) {
		// TODO Auto-generated method stub
		return employeeOptionsService.updateEmployeeOptions(obj);
	}

}
