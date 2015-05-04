package com.trinet.aboutme.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.trinet.aboutme.beans.Address;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.trinet.aboutme.dao.EmployeeInfoDAO;
import com.trinet.aboutme.dao.EmployeeOptionsDAO;
import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.EmployeeOptionsDTO;
import com.trinet.aboutme.service.EmployeeInfoService;
import com.trinet.aboutme.service.EmployeeOptionsService;

public class EmployeeOptionsServiceImpl implements EmployeeOptionsService {
	
	private EmployeeOptionsDAO employeeOptionsDAO;
	List<EmployeeOptionsDTO> optionsList;

	public EmployeeOptionsDAO getEmployeeOptionsDAO() {
		return employeeOptionsDAO;
	}

	public void setEmployeeOptionsDAO(EmployeeOptionsDAO employeeOptionsDAO) {
		this.employeeOptionsDAO = employeeOptionsDAO;
	}

	
	@Override
	public List<EmployeeOptionsDTO> updateEmployeeOptions(Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		 
		try {
	 
			// read from file, convert it to EmployeeOptionsDTO class
			EmployeeOptionsDTO employeeOptionsDTO = mapper.readValue(obj.toString(), EmployeeOptionsDTO.class);	
			optionsList = employeeOptionsDAO.updateEmployeeOptions(employeeOptionsDTO);
		
		} catch (JsonGenerationException e) {
	 
			e.printStackTrace();
	 
		} catch (JsonMappingException e) {
	 
			e.printStackTrace();
	 
		} catch (IOException e) {
	 
			e.printStackTrace();
	 
		}		
 				
		return optionsList;	 
		
	}	


}
